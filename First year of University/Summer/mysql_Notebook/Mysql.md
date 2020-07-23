# Mysql

增！删！改！查！



1. SQL、DB、DBMS分别是什么关系？
   1. DB：DataBase（数据库，数据库实际上在硬盘上以文件的形式存在）
   2. DBMS：DataBase Management System（数据库管理系统，用以管理硬盘上的数据库）
   3. SQL：结构化查询语言，是一门标准通用的语言。标准SQL适合于所有的数据库产品。SQL语句在执行的时候，实际上内部也会先进行编译，然后再执行SQL。（SQL语句的编译由DBMS完成）
2. DBMS负责执行SQL语句，通过执行SQL语句来操作DB中的数据（DBMS　－（执行）－》　　SQL　－（操作）－》　　DB）



## 表

Table是数据库的基本组成单元,所有的数据都以表格的形式组织,目的是可读性强.

一个表包括行和列:

- 行：被称为数据/记录(data)
- 列：被称为字段(column)

> 每一个字段应该包括那些属性?

字段名、数据类型、相关的约束。



在SQL中，字符串的数据类型是：varchar



## SQL语句分类

DQL（数据查询语言）：查询语句，反射select语句都是DQL

DML（数据操作语言）：insert delete update，对表中的**数据**进行增删改。

DDL（数据定义语言）：create drop alter，对表**结构**的增删改。

TCL（事务控制语言）：commit提交事务，rollback回滚事务。（TCL中的T是 Transaction）

DCL（数据控制语言）：grant授权、revoke撤销权限等。



## 导入数据

1. 登录mysql数据库管理系统

   `mysql -uroot -ppassword`

2. 查看有那些数据库

   `show databases；`（这个不是SQL语句，属于MySQL的命令）

3. 创建数据库

   `create database databaseName；`（这个不是SQL语句，属于MySQL的命令）

4. 使用创建的数据库

   `use databaseName；`（这个不是SQL语句，属于MySQL的命令）

5. 查看当前使用的数据库中有那些表

   `show tables；`（这个不是SQL语句，属于MySQL的命令）

6. 初始化数据

   `source xx.sql`（这个不是SQL语句，属于MySQL的命令）

7. 删库跑路

   `drop database databaseName；`



当一个文件的猴嘴是sql时，我们称这个文件为“sql脚本”。这个文件中编写了sql语句。

注意：当sql脚本中的数据量太大时，将无法用文档打开，此时需要用`source`命令完成初始化。



## 常用命令

### 查看表结构

`desc tableName；`：查看`tableName`表的**结构**，仅仅是结构，不是数据。



以`testdatabase`库为例，

部门表：desc dept；

```mysql
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |   
+--------+-------------+------+-----+---------+-------+
| DEPTNO | int         | NO   | PRI | NULL    |       |   部门编号
| DNAME  | varchar(14) | YES  |     | NULL    |       |   部门名称
| LOC    | varchar(13) | YES  |     | NULL    |       |   部门位置
+--------+-------------+------+-----+---------+-------+
```

员工表：desc emp；

```mysql
+----------+-------------+------+-----+---------+-------+
| Field    | Type        | Null | Key | Default | Extra |
+----------+-------------+------+-----+---------+-------+
| EMPNO    | int         | NO   | PRI | NULL    |       |   员工编号
| ENAME    | varchar(10) | YES  |     | NULL    |       |   员工姓名
| JOB      | varchar(9)  | YES  |     | NULL    |       |   工作岗位
| MGR      | int         | YES  |     | NULL    |       |   上级领导编号
| HIREDATE | date        | YES  |     | NULL    |       |   入职日期
| SAL      | double(7,2) | YES  |     | NULL    |       |   薪资
| COMM     | double(7,2) | YES  |     | NULL    |       |   津贴
| DEPTNO   | int         | YES  |     | NULL    |       |   部门编号
+----------+-------------+------+-----+---------+-------+
```

工资表：desc salgrade；

```mysql
+-------+------+------+-----+---------+-------+
| Field | Type | Null | Key | Default | Extra |
+-------+------+------+-----+---------+-------+
| GRADE | int  | YES  |     | NULL    |       |   等级
| LOSAL | int  | YES  |     | NULL    |       |   最低薪资
| HISAL | int  | YES  |     | NULL    |       |   最高薪资
+-------+------+------+-----+---------+-------+
```



### 查看表数据

`select * from tableName；`：查看表`tableName`的数据



### 查看当前正在使用的数据库

`select database()；`



### 查看正在使用的数据库版本

`select version；`



### 终止一条语句

`\C `（mysql操作）然后回车，或者`ctrl+c`（Linux操作），两种语句都可以。



### 查看当前库中的表

`show tables；`



### 查看其它库中的表

`show tables from otherDatabase；`



### 查看创建表的语句

`show create table tableName；`



### 简单的查询语句（DQL）

语法格式：`select 字段名1，字段名2，字段名3，…… from 表名；`



注意：

1. 任何一条sql语句以`;`结尾。
2. sql语句不区分大小写。
3. 字段可以参与数学运算。

给查询结果的列重命名：在查询语法中将想要重命名的字段：`字段名 as 新字段名`



在新版本的mysql中，可以不打单引号也能给新字段名，命名为中文，但是，为了保证其数据库能够在任意版本，任意环境，任意数据库操作系统下都能运行，最好在命名的时候，给中文打上单引号。这是因为在标准sql语句中，要求字符串使用单引号括起来。



### 条件查询

> 语法格式：

```mysql
select
	字段，字段……
from
	表名
where
	条件；
```

执行的逻辑顺序是，先执行`from`，再执行`where`，最后执行`select`

可以理解为，从某表中，以某个条件，查询某个字段（这个字段才是我们真正的目标，条件是用来缩小在这个表中的查询范围的）。

> 代码示例：查询工资等于5000的员工姓名

```mysql
mysql> select ename from emp where sal = 5000;
+-------+
| ename |
+-------+
| KING  |
+-------+
```

> 代码示例2：查询SMITH的工资

```mysql
mysql> select sal from emp where ename = 'SMITH';
+--------+
| sal    |
+--------+
| 800.00 |
+--------+
```

注意：在查询的过程中，遇到`varchar`数据类型时，需要用单引号括起来。

> 代码示例3：找出工资大于3000的人

```mysql
mysql> select ename,sal from emp where sal>3000;
+-------+---------+
| ename | sal     |
+-------+---------+
| KING  | 5000.00 |
+-------+---------+
```

> 代码示例4：找出工资在1100和3000之间的员工

方法一：使用小于等于符号

```mysql
mysql> select ename,sal from emp where sal>=1100 and sal<=3000;
+--------+---------+
| ename  | sal     |
+--------+---------+
| ALLEN  | 1600.00 |
| WARD   | 1250.00 |
| JONES  | 2975.00 |
| MARTIN | 1250.00 |
| BLAKE  | 2850.00 |
| CLARK  | 2450.00 |
| SCOTT  | 3000.00 |
| TURNER | 1500.00 |
| ADAMS  | 1100.00 |
| FORD   | 3000.00 |
| MILLER | 1300.00 |
+--------+---------+
```

方法二：使用`between……and……`语句（注意，此语句的缺点是，查找范围被固定为完全闭区间，缺少灵活性。且这个语句在使用过程中，要保证查询范围左小右大）

```mysql
mysql> select ename,sal from emp where sal between 1100 and 3000;
+--------+---------+
| ename  | sal     |
+--------+---------+
| ALLEN  | 1600.00 |
| WARD   | 1250.00 |
| JONES  | 2975.00 |
| MARTIN | 1250.00 |
| BLAKE  | 2850.00 |
| CLARK  | 2450.00 |
| SCOTT  | 3000.00 |
| TURNER | 1500.00 |
| ADAMS  | 1100.00 |
| FORD   | 3000.00 |
| MILLER | 1300.00 |
+--------+---------+
```



### NULL和0

在数据库中，NULL不是一个值，代表什么也没有，为空。这是与0完全不同的概念，0是一个值，空（null）不是一个值，不能用等号衡量。必须使用`is null`或者`is not null`查询。

```mysql
mysql> select ename,sal,comm from emp where comm is null;
+--------+---------+------+
| ename  | sal     | comm |
+--------+---------+------+
| SMITH  |  800.00 | NULL |
| JONES  | 2975.00 | NULL |
| BLAKE  | 2850.00 | NULL |
| CLARK  | 2450.00 | NULL |
| SCOTT  | 3000.00 | NULL |
| KING   | 5000.00 | NULL |
| ADAMS  | 1100.00 | NULL |
| JAMES  |  950.00 | NULL |
| FORD   | 3000.00 | NULL |
| MILLER | 1300.00 | NULL |
+--------+---------+------+
```

> 找出没有津贴的人（没有津贴代表津贴为0和为null都算）

```mysql
mysql> select ename,sal,comm from emp where comm is null or comm=0;
+--------+---------+------+
| ename  | sal     | comm |
+--------+---------+------+
| SMITH  |  800.00 | NULL |
| JONES  | 2975.00 | NULL |
| BLAKE  | 2850.00 | NULL |
| CLARK  | 2450.00 | NULL |
| SCOTT  | 3000.00 | NULL |
| KING   | 5000.00 | NULL |
| TURNER | 1500.00 | 0.00 |
| ADAMS  | 1100.00 | NULL |
| JAMES  |  950.00 | NULL |
| FORD   | 3000.00 | NULL |
| MILLER | 1300.00 | NULL |
+--------+---------+------+
```



### and 和 or 的优先级

and的优先级比or高，在正常开发过程中，只要记住加小括号就不会出错。



### in 等同于 or

```mysql
mysql> select ename,job from emp where job in ('SALESMAN','MANAGER');
+--------+----------+
| ename  | job      |
+--------+----------+
| ALLEN  | SALESMAN |
| WARD   | SALESMAN |
| JONES  | MANAGER  |
| MARTIN | SALESMAN |
| BLAKE  | MANAGER  |
| CLARK  | MANAGER  |
| TURNER | SALESMAN |
+--------+----------+
```

注意：in后面的是取值，不是区间，如果想要表达不在那几个取值的，就用`not in`



### 模糊查找like

在模糊查询中，必须掌握两个特殊的符号，一个是`%`，一个是`_`

`%`：代表任意多个字符

`_`：代表任意一个字符

> 示例代码1：找出名字中含有o的

```mysql
mysql> select ename from emp where ename like '%o%';
+-------+
| ename |
+-------+
| JONES |
| SCOTT |
| FORD  |
+-------+
```

> 示例代码2：找出名字中的第二个字母是A的

```mysql
mysql> select ename from emp where ename like '_A%';
+--------+
| ename  |
+--------+
| WARD   |
| MARTIN |
| JAMES  |
+--------+
```

注意：如果要查找`%`和`_`，就需要使用转义字符，将`%`和`_`转换成一个普通的字符



### 排序（升序、降序）

`order by`：默认是升序排序

> 按照工资升序，找出员工名和薪资

```mysql
mysql> select ename,sal from emp order by sal;
+--------+---------+
| ename  | sal     |
+--------+---------+
| SMITH  |  800.00 |
| JAMES  |  950.00 |
| ADAMS  | 1100.00 |
| WARD   | 1250.00 |
| MARTIN | 1250.00 |
| MILLER | 1300.00 |
| TURNER | 1500.00 |
| ALLEN  | 1600.00 |
| CLARK  | 2450.00 |
| BLAKE  | 2850.00 |
| JONES  | 2975.00 |
| SCOTT  | 3000.00 |
| FORD   | 3000.00 |
| KING   | 5000.00 |
+--------+---------+
```

注意：指定升序排序需要在查找条件之后加上`asc`，如果要指定降序排序，则需要在查找条件之后加上`desc`

例如：按指定降序排序

```mysql
mysql> select ename,sal from emp order by sal desc;
+--------+---------+
| ename  | sal     |
+--------+---------+
| KING   | 5000.00 |
| SCOTT  | 3000.00 |
| FORD   | 3000.00 |
| JONES  | 2975.00 |
| BLAKE  | 2850.00 |
| CLARK  | 2450.00 |
| ALLEN  | 1600.00 |
| TURNER | 1500.00 |
| MILLER | 1300.00 |
| WARD   | 1250.00 |
| MARTIN | 1250.00 |
| ADAMS  | 1100.00 |
| JAMES  |  950.00 |
| SMITH  |  800.00 |
+--------+---------+
```



> :star: 代码练习（重要）：按照工资的降序排序，但当工资相同的时候，相同工资的人之间通过名字的升序排序 :star:

```mysql
mysql> select ename,sal from emp order by sal desc , ename asc; //通过逗号将两个排序方式分割开来，系统会自动按照指定规则进行多次排序
+--------+---------+
| ename  | sal     |
+--------+---------+
| KING   | 5000.00 |
| FORD   | 3000.00 |
| SCOTT  | 3000.00 |
| JONES  | 2975.00 |
| BLAKE  | 2850.00 |
| CLARK  | 2450.00 |
| ALLEN  | 1600.00 |
| TURNER | 1500.00 |
| MILLER | 1300.00 |
| MARTIN | 1250.00 |
| WARD   | 1250.00 |
| ADAMS  | 1100.00 |
| JAMES  |  950.00 |
| SMITH  |  800.00 |
+--------+---------+
```

注意：多次字段排序时，离`order by`命令越近的排序字段，优先级越高，如果前面的排序字段已经包含了后面的排序字段的规则，那么后面的排序字段则不会运行，只有当前面的排序规则无法成立时，才会优先去完成其后面的排序字段。



> 练习2：找出工资岗位是SALESMAN的员工，并要求按照薪资的降序排列。

```mysql
mysql> select ename,job,sal from emp where job='SALESMAN' order by sal desc;
+--------+----------+---------+
| ename  | job      | sal     |
+--------+----------+---------+
| ALLEN  | SALESMAN | 1600.00 |
| TURNER | SALESMAN | 1500.00 |
| WARD   | SALESMAN | 1250.00 |
| MARTIN | SALESMAN | 1250.00 |
+--------+----------+---------+
```



SQL执行顺序：from --> where --> select --> order by



### 分组函数

`count`：计数

`sum`：求和

`avg`：平均值

`max`：最大值

`min`：最小值

注意：所有的分组函数都是对“某一组”数据进行操作。



1. 找出工资总和

   > select  sum(sal)  from  emp；

2. 找出最高工资

   > select  max(sal)  from  emp；

3. 找出最低工资

   > select  min(sal)  from  emp；

4. 找出平均工资

   > select  avg(sal)  from  emp；

5. 找出总人数

   > select  count(*)  from  emp；



分组函数一共五个。分组函数还有另外一个名字：多行处理函数。

多行处理函数的特点：输入多行，最终输出一行。



:star: 注意：分组函数自动忽略`null`。此时就存在一个问题，既然分组函数自动忽略`null`，那为什么下面的单行处理函数中说到，只要有null参加的运算，结果都为null？这是因为在分组函数中，其底层实现是重写的`ifnull`函数的。



重点：在SQL语句中有一个语法规则，分组函数不可直接出现在where子句中。这是因为`group by`是在`where`执行之后才会执行的。



:star: SQL语句的执行顺序：

```
select		5
……
from		1
……
where		2
……
group by	3
……
having		4
……
order by	6
……
```



> count(*)和count(具体某个字段)，他们有什么区别？
>

`count(*)`：不是统计某个字段中的数据个数，而是统计总记录条数。

`count(某个具体字段)`：表示统计具体那个字段不为null的数据总数量。



分组函数是可以组合在一起用的。



### 单行处理函数

单行处理函数：输入一行，输出一行。



:star: **重点：在所有的数据库操作系统中，只要有`NULL`参加的运算，结果都必定为`NULL`** :star: 

为了处理这样的问题，需要使用`空处理函数`：`ifnull()`

`ifnull()`：ifnull（可能存在null数据的字段，null数据将被当作什么处理）：属于单行处理函数



> ifnull练习：计算每个员工的年薪

```mysql
mysql> select ename,(sal+ifnull(comm,0))*12 as yearsal from emp;
+--------+----------+
| ename  | yearsal  |
+--------+----------+
| SMITH  |  9600.00 |
| ALLEN  | 22800.00 |
| WARD   | 21000.00 |
| JONES  | 35700.00 |
| MARTIN | 31800.00 |
| BLAKE  | 34200.00 |
| CLARK  | 29400.00 |
| SCOTT  | 36000.00 |
| KING   | 60000.00 |
| TURNER | 18000.00 |
| ADAMS  | 13200.00 |
| JAMES  | 11400.00 |
| FORD   | 36000.00 |
| MILLER | 15600.00 |
+--------+----------+
```



### group by 和 having

`group by`：按照某个字段或者某些字段进行分组。

`having`：having 是对分组之后的数据进行再次过滤。

> 代码示例1：找出每个工作岗位的最高薪资

```mysql
mysql> select max(sal),job from emp group by job;
+----------+-----------+
| max(sal) | job       |
+----------+-----------+
|  1300.00 | CLERK     |
|  1600.00 | SALESMAN  |
|  2975.00 | MANAGER   |
|  3000.00 | ANALYST   |
|  5000.00 | PRESIDENT |
+----------+-----------+
```

注意：分组函数一般都会和`group by`联合使用，这也是分组函数为什么被称为分组函数的原因。并且，每一个分组函数都是在`group by`执行结束后才执行的。当sql语句没有group by的话，整张表的数据被认为自成一组。

重点：当出现`group by`时，`select`后只能跟被分组的字段和分组函数。

> 示例代码2：找出每个部门不同工作岗位的最高薪资

```mysql
mysql> select max(sal),deptno,job from emp group by deptno,job;
+----------+--------+-----------+
| max(sal) | deptno | job       |
+----------+--------+-----------+
|  1100.00 |     20 | CLERK     |
|  1600.00 |     30 | SALESMAN  |
|  2975.00 |     20 | MANAGER   |
|  2850.00 |     30 | MANAGER   |
|  2450.00 |     10 | MANAGER   |
|  3000.00 |     20 | ANALYST   |
|  5000.00 |     10 | PRESIDENT |
|   950.00 |     30 | CLERK     |
|  1300.00 |     10 | CLERK     |
+----------+--------+-----------+
```

> 示例代码3：找出每个部门的最高薪资，但只显示薪资大于2900的数据

方案一：使用having，但此时的效率较低，因为有更高效的替代方案`where`（不是所有时候都能用`where`替代`having`的）

```mysql
mysql> select max(sal),deptno from emp group by deptno having max(sal)>=2900;
+----------+--------+
| max(sal) | deptno |
+----------+--------+
|  3000.00 |     20 |
|  5000.00 |     10 |
+----------+--------+
```

方案二：使用`where`这种更高效的方案替代`having`

```mysql
mysql> select max(sal),deptno from emp where sal>=2900 group by deptno;
+----------+--------+
| max(sal) | deptno |
+----------+--------+
|  3000.00 |     20 |
|  5000.00 |     10 |
+----------+--------+
```

注意：不是所有情况下都能使用`where`去代替`having`，例如下面的例子：

> 示例代码4：找出每个部门的平均薪资，要求显示薪资大于2900的数据。

```mysql
mysql> select avg(sal),deptno from emp group by deptno having avg(sal)>=2000;
+-------------+--------+
| avg(sal)    | deptno |
+-------------+--------+
| 2175.000000 |     20 |
| 2916.666667 |     10 |
+-------------+--------+
```

这是因为，我们需要过滤的数据出现在where执行之后，此时只能进行二次过滤，需要用having语句。

:star2: 重点：`having`是`group by`的搭档，只有当`group by`出现时，才能使用`having`！:star2:



### 去重

`distinct`：去除重复数据。

注意：这种去重方式是一种联合去重

`distinct`只能放在所有字段的最前面

> 示例代码：统计岗位的数量

```mysql
mysql> select count(distinct job) from emp;
+---------------------+
| count(distinct job) |
+---------------------+
|                   5 |
+---------------------+
```



## DQL

```mysql
select		5
……
from		1
……
where		2
……
group by	3
……
having		4
……
order by	6
……
```



### 连续查询

在实际情况下，都不是从单表中查询数据，一般都是多张表联合查询出最终结果。



连续查询的分类：

1. 根据语法的出现年代划分：
   1. SQL92
   2. SQL99
2. 根据表的连接方式划分：
   1. 内连接：
      1. 等值连接
      2. 非等值连接
      3. 自连接
   2. 外连接：
      1. 左外连接（左连接）
      2. 右外连接（右连接）
   3. 全连接



在表的连接查询方面存在一种现象，被称为：笛卡尔积现象。（笛卡尔乘积现象）

笛卡尔积现象：当两种表联合查询，没有任何条件进行限制，那么最终的查询结果的条数是两张表的条数的乘积。

> 案例：找出每一个员工的部门名称，要求显示员工名和部门名。

```mysql
mysql> select ename,dname from emp,dept;
+--------+------------+
| ename  | dname      |
+--------+------------+
| SMITH  | ACCOUNTING |
| SMITH  | RESEARCH   |
| SMITH  | SALES      |
| SMITH  | OPERATIONS |
| ALLEN  | ACCOUNTING |
| ALLEN  | RESEARCH   |
| ALLEN  | SALES      |
| ALLEN  | OPERATIONS |
| WARD   | ACCOUNTING |
| WARD   | RESEARCH   |
| WARD   | SALES      |
| WARD   | OPERATIONS |
| JONES  | ACCOUNTING |
| JONES  | RESEARCH   |
| JONES  | SALES      |
| JONES  | OPERATIONS |
| MARTIN | ACCOUNTING |
| MARTIN | RESEARCH   |
| MARTIN | SALES      |
| MARTIN | OPERATIONS |
| BLAKE  | ACCOUNTING |
| BLAKE  | RESEARCH   |
| BLAKE  | SALES      |
| BLAKE  | OPERATIONS |
| CLARK  | ACCOUNTING |
| CLARK  | RESEARCH   |
| CLARK  | SALES      |
| CLARK  | OPERATIONS |
| SCOTT  | ACCOUNTING |
| SCOTT  | RESEARCH   |
| SCOTT  | SALES      |
| SCOTT  | OPERATIONS |
| KING   | ACCOUNTING |
| KING   | RESEARCH   |
| KING   | SALES      |
| KING   | OPERATIONS |
| TURNER | ACCOUNTING |
| TURNER | RESEARCH   |
| TURNER | SALES      |
| TURNER | OPERATIONS |
| ADAMS  | ACCOUNTING |
| ADAMS  | RESEARCH   |
| ADAMS  | SALES      |
| ADAMS  | OPERATIONS |
| JAMES  | ACCOUNTING |
| JAMES  | RESEARCH   |
| JAMES  | SALES      |
| JAMES  | OPERATIONS |
| FORD   | ACCOUNTING |
| FORD   | RESEARCH   |
| FORD   | SALES      |
| FORD   | OPERATIONS |
| MILLER | ACCOUNTING |
| MILLER | RESEARCH   |
| MILLER | SALES      |
| MILLER | OPERATIONS |
+--------+------------+
```



表的别名：

> ​	select e.ename,d.dname from emp e,dept d;

起别名的好处：

	1. 执行效率高
 	2. 可读性好



如何避免笛卡尔积现象：加条件进行过滤

注意：避免了笛卡尔积现象无法提升程序的执行效率，因为在底层匹配的过程中，还是会把每种情况都匹配出来，但是在显示过程中，会进行条件过滤。

```mysql
mysql> select e.ename,d.dname from emp e,dept d where e.deptno=d.deptno;
+--------+------------+
| ename  | dname      |
+--------+------------+
| SMITH  | RESEARCH   |
| ALLEN  | SALES      |
| WARD   | SALES      |
| JONES  | RESEARCH   |
| MARTIN | SALES      |
| BLAKE  | SALES      |
| CLARK  | ACCOUNTING |
| SCOTT  | RESEARCH   |
| KING   | ACCOUNTING |
| TURNER | SALES      |
| ADAMS  | RESEARCH   |
| JAMES  | SALES      |
| FORD   | RESEARCH   |
| MILLER | ACCOUNTING |
+--------+------------+
```

注意：以上是SQL92语法，实际上已经不用了，下面的SQL99语法才是真正常用的



#### 内连接之等值连接

最大的特点：条件是等量关系

> 语法：

```mysql
select
	字段
from
	表A
inner join   //inner可省略，带上至少可读性更好一些
	表B
on
	连接条件
where
	……
```

> 代码演示：案例：找出每一个员工的部门名称，要求显示员工名和部门名。

```mysql
mysql> select e.ename,d.dname from emp e join dept d on e.deptno=d.deptno;
+--------+------------+
| ename  | dname      |
+--------+------------+
| SMITH  | RESEARCH   |
| ALLEN  | SALES      |
| WARD   | SALES      |
| JONES  | RESEARCH   |
| MARTIN | SALES      |
| BLAKE  | SALES      |
| CLARK  | ACCOUNTING |
| SCOTT  | RESEARCH   |
| KING   | ACCOUNTING |
| TURNER | SALES      |
| ADAMS  | RESEARCH   |
| JAMES  | SALES      |
| FORD   | RESEARCH   |
| MILLER | ACCOUNTING |
+--------+------------+
```



#### 内连接之非等值连接

最大的特点：连接条件中的关系是非等量关系

> 案例：找出每个员工的工资等级，要求显示员工名、工资、工资等级

```mysql
mysql>  select e.ename,e.sal,s.grade from emp e join salgrade s on e.sal between s.losal and s.hisal;
+--------+---------+-------+
| ename  | sal     | grade |
+--------+---------+-------+
| SMITH  |  800.00 |     1 |
| ALLEN  | 1600.00 |     3 |
| WARD   | 1250.00 |     2 |
| JONES  | 2975.00 |     4 |
| MARTIN | 1250.00 |     2 |
| BLAKE  | 2850.00 |     4 |
| CLARK  | 2450.00 |     4 |
| SCOTT  | 3000.00 |     4 |
| KING   | 5000.00 |     5 |
| TURNER | 1500.00 |     3 |
| ADAMS  | 1100.00 |     1 |
| JAMES  |  950.00 |     1 |
| FORD   | 3000.00 |     4 |
| MILLER | 1300.00 |     2 |
+--------+---------+-------+
```

上述语句拆解：

```mysql
select 
	e.ename,e.sal,s.grade 
from 
	emp e 
join 
	salgrade s 
on 
	e.sal between s.losal and s.hisal;
```



#### 自连接

最大特点：一张表看作两张表。自己连接自己。

> 案例：找出每个员工的上级领导，要求显示员工名和对应的领导名

```mysql
mysql> select e.ename,f.ename from emp e join emp f on e.mgr=f.empno;
+--------+-------+
| ename  | ename |
+--------+-------+
| SMITH  | FORD  |
| ALLEN  | BLAKE |
| WARD   | BLAKE |
| JONES  | KING  |
| MARTIN | BLAKE |
| BLAKE  | KING  |
| CLARK  | KING  |
| SCOTT  | JONES |
| TURNER | BLAKE |
| ADAMS  | SCOTT |
| JAMES  | BLAKE |
| FORD   | JONES |
| MILLER | CLARK |
+--------+-------+
```



#### 外连接

> 外连接与内连接的区别

​	内连接：假设A和B表进行连接，使用内连接的话，凡是A表和B表能够匹配的上的数据的查询出来。这就是内连接。A和B没有主副之分，两张表是平等的。

​	外连接：假设A和B表进行连接，使用外连接的话，A、B两张表中有一张是主表，有一张是副表，主要查询主表中的数据，捎带着查询副表，如果副表中的数据没有和主表的数据匹配的上，副表中自动模拟出NULL与之匹配。



外连接分为：

​	左外连接（左连接）：表示左边的这张表是主表。

​	右外连接（右连接）：表示右边的这张表是主表。

左连接有右连接的写法，右连接也会有对应的左连接的写法。



> 案例：找出每个员工的上级领导（所有员工必须查询出来，包括最大的老板也要包含在其中）

```mysql
mysql> select a.ename as '员工',b.ename as '领导' from emp a left join emp b on a.mgr = b.empno;
+--------+-------+
| 员工   | 领导  |
+--------+-------+
| SMITH  | FORD  |
| ALLEN  | BLAKE |
| WARD   | BLAKE |
| JONES  | KING  |
| MARTIN | BLAKE |
| BLAKE  | KING  |
| CLARK  | KING  |
| SCOTT  | JONES |
| KING   | NULL  |
| TURNER | BLAKE |
| ADAMS  | SCOTT |
| JAMES  | BLAKE |
| FORD   | JONES |
| MILLER | CLARK |
+--------+-------+
```

> 指令详解：

```mysql
select
	a.ename as '员工', b.ename as '领导'
from
	emp a
left outer join //outer可以省略
	emp b
on
	a.mgr = b.empno;
```

外连接最重要的特点：主表的数据无条件的全部查询出来。



#### 三张表连续查询

> 语法解析

```mysql
……
  A
join
  B
on
  条件
join
  C
on
  条件
```

注意：以上语法的意思是：A表和B表先进行连接，连接之后得到的一个新的A表，再将这个表与C表连接，得到最终结果。



> 案例1：找出每一个员工的部门名称以及工资等级

```mysql
mysql> select e.ename,d.dname,s.grade from emp e join dept d on e.deptno = d.deptno join salgrade s on e.sal between s.losal and s.hisal;
+--------+------------+-------+
| ename  | dname      | grade |
+--------+------------+-------+
| SMITH  | RESEARCH   |     1 |
| ALLEN  | SALES      |     3 |
| WARD   | SALES      |     2 |
| JONES  | RESEARCH   |     4 |
| MARTIN | SALES      |     2 |
| BLAKE  | SALES      |     4 |
| CLARK  | ACCOUNTING |     4 |
| SCOTT  | RESEARCH   |     4 |
| KING   | ACCOUNTING |     5 |
| TURNER | SALES      |     3 |
| ADAMS  | RESEARCH   |     1 |
| JAMES  | SALES      |     1 |
| FORD   | RESEARCH   |     4 |
| MILLER | ACCOUNTING |     2 |
+--------+------------+-------+
```

上述题目语句：

```mysql
select 
	e.ename,d.dname,s.grade 
from 
	emp e 
join 
	dept d 
on 
	e.deptno = d.deptno 
join 
	salgrade s 
on 
	e.sal between s.losal and s.hisal;
```



> :star:（重要）案例2：找出每一个员工的部门名称、工资等级、以及上级领导。:star:

```mysql
mysql> select e.ename as '员工',d.dname,s.grade,e1.ename as '领导' from emp e join dept d on e.deptno = d.deptno join salgrade s on e.sal between s.losal and s.hisal left join emp e1 on e.mgr=e1.empno;
+--------+------------+-------+-------+
| 员工    | dname      | grade | 领导  |
+--------+------------+-------+-------+
| SMITH  | RESEARCH   |     1 | FORD  |
| ALLEN  | SALES      |     3 | BLAKE |
| WARD   | SALES      |     2 | BLAKE |
| JONES  | RESEARCH   |     4 | KING  |
| MARTIN | SALES      |     2 | BLAKE |
| BLAKE  | SALES      |     4 | KING  |
| CLARK  | ACCOUNTING |     4 | KING  |
| SCOTT  | RESEARCH   |     4 | JONES |
| KING   | ACCOUNTING |     5 | NULL  |
| TURNER | SALES      |     3 | BLAKE |
| ADAMS  | RESEARCH   |     1 | SCOTT |
| JAMES  | SALES      |     1 | BLAKE |
| FORD   | RESEARCH   |     4 | JONES |
| MILLER | ACCOUNTING |     2 | CLARK |
+--------+------------+-------+-------+
```

上述问题的解决方案中，将外连接和内连接联合使用了！指令代码：:star:

```mysql
select 
	e.ename as '员工',d.dname,s.grade,e1.ename as '领导' 
from 
	emp e 
join 
	dept d 
on 
	e.deptno = d.deptno 
join 
	salgrade s 
on 
	e.sal between s.losal and s.hisal 
left join 
	emp e1 
on 
	e.mgr=e1.empno;
```





### 子查询

> 什么是子查询？

​	select语句当中嵌套select语句，被嵌套的select语句就是子查询。

> 子查询可以出现在哪里

```mysql
select
	……（select）……
from
	……（select）……
where
	……（select）……
```



#### 在where子句中使用子查询

> 案例1：找出高于平均薪资的员工

```mysql
mysql> select * from emp where sal>(select avg(sal) from emp);
+-------+-------+-----------+------+------------+---------+------+--------+
| EMPNO | ENAME | JOB       | MGR  | HIREDATE   | SAL     | COMM | DEPTNO |
+-------+-------+-----------+------+------------+---------+------+--------+
|  7566 | JONES | MANAGER   | 7839 | 1981-04-02 | 2975.00 | NULL |     20 |
|  7698 | BLAKE | MANAGER   | 7839 | 1981-05-01 | 2850.00 | NULL |     30 |
|  7782 | CLARK | MANAGER   | 7839 | 1981-06-09 | 2450.00 | NULL |     10 |
|  7788 | SCOTT | ANALYST   | 7566 | 1987-04-19 | 3000.00 | NULL |     20 |
|  7839 | KING  | PRESIDENT | NULL | 1981-11-17 | 5000.00 | NULL |     10 |
|  7902 | FORD  | ANALYST   | 7566 | 1981-12-03 | 3000.00 | NULL |     20 |
+-------+-------+-----------+------+------------+---------+------+--------+
```



#### from后面嵌套子查询

> 案例1：找出每个部门平均薪水的薪资等级

```mysql
select 
	t.*,s.grade 
from 
	(select deptno,avg(sal) as avgsal from emp group by deptno) t 
join 
	salgrade s 
on 
	t.avgsal between s.losal and s.hisal;
```

```mysql
mysql> select t.*,s.grade from (select deptno,avg(sal) as avgsal from emp group by deptno) t join salgrade s on t.avgsal between s.losal and s.hisal;
+--------+-------------+-------+
| deptno | avgsal      | grade |
+--------+-------------+-------+
|     20 | 2175.000000 |     4 |
|     30 | 1566.666667 |     3 |
|     10 | 2916.666667 |     4 |
+--------+-------------+-------+
```

 

> 案例2：找出每个部门薪资等级的平均值

```mysql
select 
	t.deptno,avg(s.grade)
from 
	emp t 
join 
	salgrade s 
on 
	t.sal between s.losal and s.hisal
group by
	t.deptno;
```

```mysql
+--------+--------------+
| deptno | avg(s.grade) |
+--------+--------------+
|     20 |       2.8000 |
|     30 |       2.5000 |
|     10 |       3.6667 |
+--------+--------------+
```



#### 在select后面嵌套子查询

> 案例1：找出每个员工所在部门的名称，要求先杀死员工名和部门名。

```mysql
select 
	e.ename,e.deptno,(select 
						d.dname 
					  from 
						dept d 
					  where 
						e.deptno=d.deptno) as dname
from
	emp e;
```

```mysql
mysql> select e.ename,e.deptno,(select d.dname from dept d where e.deptno=d.deptno) as dname from emp e;
+--------+--------+------------+
| ename  | deptno | dname      |
+--------+--------+------------+
| SMITH  |     20 | RESEARCH   |
| ALLEN  |     30 | SALES      |
| WARD   |     30 | SALES      |
| JONES  |     20 | RESEARCH   |
| MARTIN |     30 | SALES      |
| BLAKE  |     30 | SALES      |
| CLARK  |     10 | ACCOUNTING |
| SCOTT  |     20 | RESEARCH   |
| KING   |     10 | ACCOUNTING |
| TURNER |     30 | SALES      |
| ADAMS  |     20 | RESEARCH   |
| JAMES  |     30 | SALES      |
| FORD   |     20 | RESEARCH   |
| MILLER |     10 | ACCOUNTING |
+--------+--------+------------+
```





### union

union可以将查询结果集相加。

> 案例1：找出工作岗位是SALESMAN和MANAGER的员工。

```mysql
select ename,job from emp where job = 'MANAGER'
union
select ename,job from emp where job = 'SALESMAN';
```

```mysql
mysql> select ename,job from emp where job = 'MANAGER' union select ename,job from emp where job = 'SALESMAN';
+--------+----------+
| ename  | job      |
+--------+----------+
| JONES  | MANAGER  |
| BLAKE  | MANAGER  |
| CLARK  | MANAGER  |
| ALLEN  | SALESMAN |
| WARD   | SALESMAN |
| MARTIN | SALESMAN |
| TURNER | SALESMAN |
+--------+----------+
```





### :star:limit以及通用分页SQL

#### limit

limit是重点中的重点，以后分页查询全靠它。

limit是mysql特有的，其它数据库中没有，不通用。（Oracle中有个一样的机制叫作rownum）

limit取结果集中的部分数据，这是它的作用。

> 语法机制

> limit startIndex，length
>
> ​		startIndex表示起始位置
>
> ​		length表示取几个



> 案例1：取出工资前五名的员工（思路：降序取前5个）

```mysql
写法一：select ename,sal from emp order by sal desc limit 0,5;
写法二：select ename,sal from emp order by sal desc limit 5;
```

```mysql
mysql> select ename,sal from emp order by sal desc limit 0,5;
+-------+---------+
| ename | sal     |
+-------+---------+
| KING  | 5000.00 |
| FORD  | 3000.00 |
| SCOTT | 3000.00 |
| JONES | 2975.00 |
| BLAKE | 2850.00 |
+-------+---------+
```



limit是sql语句中最后执行的一个环节！

```mysql
select		5
……
from		1
……
where		2
……
group by	3
……
having		4
……
order by	6
……
limit		7
……；
```



> 案例2：取出工资第4到第9的员工

```mysql
select ename,sal from emp order by sal desc limit 3,6;
```

```mysql
mysql> select ename,sal from emp order by sal desc limit 3,6;
+--------+---------+
| ename  | sal     |
+--------+---------+
| JONES  | 2975.00 |
| BLAKE  | 2850.00 |
| CLARK  | 2450.00 |
| ALLEN  | 1600.00 |
| TURNER | 1500.00 |
| MILLER | 1300.00 |
+--------+---------+
```

注意：limit的取址区间是左开右闭，所以取4-9名是从3开始取的6个人（不包括3，因为3位于左开区间那一端）



#### 通用的标准分页sql

> 分页的标准形式：
>
> ​		每页显示pageSize条记录：
>
> ​		第pageNo页：（pageNo - 1）* pageSize，pageSize





## DDL



### 创建表

> 建表语句的语法格式：
>
> ​		create table 表名（
>
> ​				字段名1  数据类型，
>
> ​				字段名1  数据类型，
>
> ​				字段名1  数据类型，
>
> ​				……
>
> ​		）；



在MySQL中常见的字段的是数据类型：

​	int（整数型）、bigint（长整型）、float（浮点型）、char（定长字符串）、varchar（可变长字符串）、date（日期类型）、BLOB（二进制大对象（存储图片、视频等流媒体信息））、CLOB（字符大对象（存储较大文本，比如可以存储4G的字符串））



> char和varchar如何选择？

在实际开发中，当某个字段中的数据长度不发生改变的时候，是定长的，例如性别、生日等，那就采用char。当一个字段的数据长度不确定，例如间接、姓名等都采用varchar。



表名在数据库当中一般建议以：`t_`或者`tbl_`开始。



实例：

```mysql
create table t_student(
	no bigint,
    name varchar(255),
    sex char(1),
    classno varchar(255),
    birth char(10)
);
```

注意：在建表过程中，可以指定字段的默认值（不指定那就是NULL），例如我指定性别是1，那么就需要写成`sex char(1) default 1`



### insert语句插入数据

> 语法格式：
>
> ​		insert  into  表名（字段名1，字段名2，字段名3，……）  values（值1，值2，值3，……）
>
> 要求：字段的数量和值的数量要相同，并且数据类型要对应相同。



实例：

```mysql
insert into t_student(no,name,sex,classno,birth) values(1,'张三','1','高三1班','1950-10-12');
```



注意：不赋值的空会自动填上`NULL`。同时，当insert语句执行成功之后，表格之中必然会多一行记录。即使多的那行记录中某些字段是`NULL`，后期页没有办法在执行`insert`语句插入数据了，只能使用`update`语句进行更新。



`t_student`后面括号里的内容是可以省略的，但是省略后就代表着values中插入的数据，就**必须**按照字段的顺序和数量插入，不能改变顺序。

实例：

```mysql
insert into t_student values(1,'merry','0','高三2班','1986-10-23');
```



insert是可以一次插入多行数据的，只需要在`values`后面写多个括号，并最终括号里面按顺序和数量填充数值即可，每个括号之间用逗号隔开。

实例：

```mysql
insert into 
	t_student(no,name,sex,classno,birth) 
values
	(4,'王五','1','高三3班','1990-10-11'),
    (5,'Rose','0','高三2班','1999-11-21');
```



### 表的复制

> 语法：
>
> ​		create  table  表名  as  select语句；
>
> ​		将查询结果当做表创建出来。

实例：

```mysql
create table emp1 as select * from emp;  //这段代码表明是将emp中的所有信息都复制到了emp1表中
create table emp2 as select ename,sal from emp;  //这段代码表明只将emp表中的ename和sal数据复制到了emp2表中
```



将查询结果插入到一张表中：

```mysql
insert into detp1 select * from dept；
```

注意：插入过程中**列**的数量要一样



### 修改数据

`update`

> 语法格式：
>
> ​		update  表名  set  字段名1=值1，字段名2=值2……where  条件；
>
> 注意：如果没有写条件，那就是整张表的数据全部更新。



> 案例1：将部门10 的LOC修改为SHANGHAI，将部门名称修改为人事部

```mysql
update dept1 set loc='SHANGHAI',dname='RENSHIBU' where deptno=10;
```





### 删除数据

`delete`

> 语法格式：
>
> ​		delete  from  表名  where  条件；
>
> 注意：没有写条件就会全部删除



> 案例：删除部门编号为10的数据

```mysql
delete from dept1 where deptno=10;

old：
+--------+------------+----------+
| DEPTNO | DNAME      | LOC      |
+--------+------------+----------+
|     10 | RENSHIBU   | SHANGHAI |
|     20 | RESEARCH   | DALLAS   |
|     30 | SALES      | CHICAGO  |
|     40 | OPERATIONS | BOSTON   |
+--------+------------+----------+

new：
+--------+------------+---------+
| DEPTNO | DNAME      | LOC     |
+--------+------------+---------+
|     20 | RESEARCH   | DALLAS  |
|     30 | SALES      | CHICAGO |
|     40 | OPERATIONS | BOSTON  |
+--------+------------+---------+
```



:star:（重点）怎么删除大表：

当一个表的数据量特别大时，需要删除整个表就得用更高效的语句：`truncate`

> 语法格式：
>
> ​		truncate  table  tableName；

注意：这样的删除方式是直接将表阶段，不可回滚。永久丢失。



### 对表结构的修改

```mysql
案例:表结构
CREATE TABLE `login_user` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `name` varchar(225) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '名字',
  `password` varchar(26) DEFAULT NULL COMMENT '密码3',
  `type` varchar(32) DEFAULT NULL,
  `state` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `password5` varchar(26) DEFAULT NULL COMMENT '密码5',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;


1.修改字段：一般修改属性和数据类型

alter table login_user modify password varchar(25) DEFAULT NULL COMMENT '密码2'

2.重命名字段：alter table 表名 change 老字段   新字段  数据类型 [属性][位置]；

alter table login_user change password2  password varchar(26) DEFAULT NULL COMMENT '密码3'

3.新增字段：alter  table  表名  add [column]  字段名  数据类型  [列属性][位置]
位置：字段可以存放在表中的任意位置；
first：第一个位置；
after：在哪个字段之后；默认在最后一个字段的后面。

--添加到最后
alter  table  login_user  add   password3  varchar(26) DEFAULT NULL COMMENT '密码4'
--添加到指定字段后面  alter table + 表名 + add + 要添加的字段 字段类型 +  after  + 要跟随的字段名
alter  table  login_user  add   password6   varchar(26)  DEFAULT NULL COMMENT '密码6'  after password

4.删除字段：alter table 表名 drop 字段名；

alter  table  login_user  drop   password5
```



### 删除表

`drop table 表名；`

`drop table if exists 表名；`如果存在这个表就删除它



### CRUD操作（标准术语）

Create(增)  Retrieve(检索)  Update(修改)  Delete(删除)



### 约束

约束的目的是为了保证表中的数据的合法性、有效性、完整性。

> 常见约束

非空约束（not null）：指定某一列不能为null（`not null`只有列级约束，没有表级约束）

唯一约束（unique）：指定一列或几列的值不允许重复

主键约束（primary key）：可以当成以上两个的合并概念，不能为空且不能重复

外键约束（foreign key）：

检查约束（check）：



#### 唯一性约束（unique）

唯一性约束修饰的字段具有唯一性，其它数据不能重复。但null可以重复。（因为null不是具体的一个值）



> 案例1：给某一列添加unique

```mysql
drop table if exists t_user;
create table t_user(
	id int,
    username varchar(255) unique
)；
```



> 案例2：给多个列添加unique（此时叫列级约束）

```mysql
drop table if exists t_user;
create table t_user(
	id int,
    username varchar(255) unique，
    usercode varchar(255) unique
)；
```



> 案例3：多个列进行联合unique（此时叫表级约束）

```mysql
drop table if exists t_user;
create table t_user(
	id int,
    username varchar(255),
    usercode varchar(255),
    unique(username,usercode)
);
```

注意：对于联合`unique`，必须二者同时重复才算重复，例如上述代码中，如果`username`重复，但`usercode`没有重复，此时是不算重复的。



#### 主键约束

> 如何给一张表加主键约束：

```mysql
drop table if exists t_user;
create table t_user(
	id int primary key,
    username varchar(255),
    email varchar(255)
);
```

注意：上述表中，因为id成为主键，在这个主键字段中，id既不能为null，也不能重复。



> 主键相关的术语

主键约束：`primary key`

主键字段：添加了`primary key`的字段叫主键字段

主键值：主键字段中的每一个值都是主键值



> 主键的作用有什么

- 表的设计三范式中有要求，第一范式就要求任何一张表都应该有主键。
- 主键的作用：主键值是这行记录在这张表当中的唯一标识。（就像身份证号一样）



:star:一张表的主键约束只能有一个:star:



> 主键的分类

根据主键字段和字段数量来划分：

- 单一主键
- 复合主键（多个字段联合起来添加一个主键约束）（不建议用，因为违背了表的三范式）

根据主键性质来划分：

- 自然主键
- 业务主键：主键值和系统的业务主键挂钩（不推荐用，因为耦合度高了）



> :star:MySQL提供的主键值自增（primary key auto_increment）:star:

```mysql
drop table if exists t_user;
create table t_user(
	id int primary key auto_increment,  //id字段自动维护一个自增的数字，从1开始，以1递增
    username varchar(255),
    email varchar(255)
);
```





#### 外键约束

> 语法：

`foreign key(子表字段) references 父表(父表字段)`

注意：一般情况下外键引用的父表字段是主键字段，但非主键字段也能引用，但至少需要具有unique约束。



> 关于外键约束的术语：

外键约束：foreign key

外键字段：添加有外键约束的字段

外键值：外键字段中的每一个值



> 举例：设计数据库表，用来维护学生和班级的信息

第一种方案：一张表存储所有数据（不推荐，因为数据冗余）

第二种方案：两张表（班级表和学生表）

```
t_class：
cno(pk)        cname
----------------------------
101              一班
102              二班
```

```
t_student：
sno(pk)        sname        classcno(该字段添加外键约束pk)
--------------------------------------------
1               zs1          101
2               zs2          101
3               zs3          102
4               zs4          102
5               zs5          102
```

添加外键约束的作用就在于，`classcno`字段中能填写的内容只能来自于`t_class`表中的主键值，不能超出那个范围

以上表的建表语句：

`t_student`中的`classno`字段引用了`t_class`表中的`cno`字段，此时的`t_student`表叫作子表，`t_class`表叫父表。（注意：如果后续要删除表，需要先删子表才能再删父表）

```mysql
drop table if exists t_student;
drop table if exists t_class;
create table t_class(
	cno int,
    cname varchar(255),
	primary key(cno)
);

create table t_student(
	sno int primary key,
    sname varchar(255),
    classno int,
    foreign key(classno) references t_class(cno) //此处就是外键的语法
);

insert into t_class values(101,'xxxxxxx');
insert into t_class values(102,'yyyyyyy');

insert into t_student values(1,'zs1',101);
insert into t_student values(2,'zs2',101);
insert into t_student values(3,'zs3',102);
insert into t_student values(4,'zs4',102);
insert into t_student values(5,'zs5',102);
```

注意：外键存在顺序要求

> 顺序要求：
>
> ​		删除数据的时候，先删除子表，再删除父表。
>
> ​		添加数据的时候，先添加父表，再添加子表。
>
> ​		创建表的时候，先创建父表，再创建子表。
>
> ​		删除表的时候，先删除子表，再删除父表。




## 存储引擎

存储引擎属于MySQL特有，不过Oracle数据库有个类似的，只是不叫存储引擎。

MySQL默认使用的存储引擎是`InnoDB`方式

默认采用的字符集是UTF-8

MySQL支持多种存储引擎，每一种存储引擎对应了一种不同的存储方式，需要根据实际需求进行选择。



> 查看当前支持的存储引擎

`show engines \G；`



> 常见的存储引擎

1.MyISAM

```mysql
      Engine: MyISAM
     Support: YES
     Comment: MyISAM storage engine
Transactions: NO  //此处表示不支持事务控制
          XA: NO
  Savepoints: NO
```

MyISAM不支持事务控制，是MySQL最常见的，但并不是默认引擎。

优点：可被压缩，节省存储空间。并且可以转换为只读表，提高检索效率。

缺点：不支持事务。



2.InnoDB

```mysql
      Engine: InnoDB
     Support: DEFAULT
     Comment: Supports transactions, row-level locking, and foreign keys
Transactions: YES
          XA: YES
  Savepoints: YES
```

优点：支持事务、行级锁、外键、崩溃后自动回复、级联删除和级联更新等。这种存储引擎数据的安全能够得到保障。

缺点：重量级的存储引擎

表的结构存储在xxx.frm文件中，数据存储在tablespace这样的表空间中(逻辑概念)，无法被压缩，无法转换成只读。



3.MEMORY

```mysql
      Engine: MEMORY
     Support: YES
     Comment: Hash based, stored in memory, useful for temporary tables
Transactions: NO
          XA: NO
  Savepoints: NO
```

优点：速度极快

缺点：不支持事务。数据容易丢失。因为所有数据和索引都是存储在内存当中。（这表明一旦断电就会数据丢失）





## 事务(Transaction)

> 什么是事务？

一个事务是一个完整的业务逻辑单元，不可再分。

比如：银行账户转账，从A账户向B账户转账10000，需要执行两条update语句。

```mysql
update t_act set balance = balance - 10000 where actno = 'act-001'；
update t_act set balance = balance + 10000 where actno = 'act-002'；
```

以上两条DML语句必须同时成功或者同时失败，不允许出现一条成功一条失败的情况。

要想保证以上两条DML语句同时成功或同时失败，那么就需要使用数据库的“事务机制”。



> DML语句（insert delete update）

只有DML语句才与事务相关。因为只有这三个语句都是和数据库表当中的数据相关的。

事务的存在是为了保证数据的完整性、安全性。



假设所有的业务都能使用一条DML语句，那就不需要事务了，但现实是不现实的。所有通常一个事务需要使用多条DML语句。



> 事务的特性

事务的四大特性：ACID

A：原子性：事务是最小的工作单元，不可再拆分

C：一致性：事务必须保证多条DML语句必须同时成功或同时失败

I：隔离性：事务A和事务B之间需要隔离（隔离级别不同会影响事务最终的效果）

D：持久性：持久性说是最终数据必须持久化到硬盘文件，事务才算成功结束



> 事务之间的隔离性

事务隔离性存在隔离级别，理论上隔离级别包括四个：

第一级别：读未提交（read  uncommitted）：对方事务还没有提交，我们当前事务可以读取到对方未提交的数据。读未提交存在脏读（dirty read）现象，表示读到了脏数据。

第二级别：读已提交（read  committed）：对方事务提交之后的数据我们可以读取到。这种隔离级别解决了藏独现象，但读已提交存在不可重复读的问题。

第三级别：可重复读取（repeatable  read）：这种隔离级别解决了不可重复读问题。这种隔离级别的问题是，隔离太太高，导致我们读取到的数据是幻象。

第四级别：序列化读/串行化读（serializable）：解决了所有问题，数据最安全，但效率低，需要事务排队，无法并发。

MySQL在默认情况下是第三隔离级别。Oracle默认的第二隔离级别。



MySQL在默认情况下是自动提交的，只要执行一条DML语句则提交一次。如果想要关闭自动提交就需要使用指令：`start transaction`



> 设置隔离级别

在进行了`use 表名；`之后，输入：

```mysql
set global transaction isolation level 隔离级别代码；
//set global 设置全局
//transaction isolation level 隔离级别
//隔离级别代码就是那四个隔离界别的英文，例如序列化是serializable，读未提交是read uncommitted
```



> 查看隔离级别

```mysql
select @@global.tx_isolation；
```





## 索引

> 什么是索引

索引就相当于一本书的目录，通过目录可以快速的找到对应的资源。在数据库方面，查询一张表的时候有两种检索方式：

​	第一种方式：全表扫描

​	第二种方式：根据索引检索（效率极高）

索引能够提高检索效率的根本原因就是缩小了扫描范围。

索引虽然能提高检索效率，但是不能随意的添加索引，因为索引页是数据库中的对象，页需要数据库不断的维护。是有维护成本的。比如，表中的数据经常被修改，这样就不适合添加索引，因为数据一旦修改，索引需要重新排序，进行维护。

添加索引是给某一个字段 或者某些字段添加。



> 创建索引对象

create  index  索引名称  on  表名(字段名)；



> 删除索引对象

drop  index  索引名称  on  表名；



> 什么时候考虑给字段添加索引

- 数据量庞大。（但也需要根据实际情况）
- 该字段的DML操作很少。（因为字段进行修改操作，索引也需要维护）
- 该字段经常出现在where子句中。（经常根据哪个字段查询）



注意：主键和具有unique约束的字段会自动添加索引。根据主键查询效率较高，尽量根据主键检索。



> 查看sql语句的执行计划

```mysql
explain select 字段1，字段2，…… from 表名 where 条件；
```

```mysql
举例：explain select ename,sal from emp where sal=5000;

mysql> explain select ename,sal from emp where sal=5000;
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+-------------+
| id | select_type | table | partitions | type | possible_keys | key  | key_len | ref  | rows | filtered | Extra       |
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+-------------+
|  1 | SIMPLE      | emp   | NULL       | ALL  | NULL          | NULL | NULL    | NULL |   14 |    10.00 | Using where |
+----+-------------+-------+------------+------+---------------+------+---------+------+------+----------+-------------+

//可以看到，Type字段的值是ALL，说明这条语句在执行过程中是全表扫描。
```

给以上的薪资sal字段添加索引：

```mysql
create  index  emp_sal_index  on  emp(sal)；
```



> 索引的底层数据结构

索引底层采用的数据结构是：B+Tree



> 索引的底层实现原理

通过B Tree缩小扫描范围，底层索引进行了排序、分区，索引会携带数据在表中的物理地址，最终通过索引检索到的数据之后，获取到关联的物理地址，通过物理地址定位到表中的数据，效率是最高的。



> 索引分类

单一索引：给单个字段添加索引

复合索引：给多个字段联合添加一个索引

主键索引：主键会自动添加索引

唯一索引：有unique约束的字段上会自动添加索引



> 索引什么时候会失效

模糊查询的时候，第一个通配符使用的是`%`，这个时候索引是失效的。

```mysql
select ename from emp where ename like '%A%'
```





## 视图(View)

> 什么是视图

站在不同的角度去看数据。（同一张表的数据，通过不同的角度去看待）



> 如何创建视图

```mysql
create  view  myview  as  select  empno,ename  from  emp;
```

创建视图的后面只能写select语句，只有DQL语句才能以视图对象的方式创建出来。

注意：只是创建的时候是这样的要求。在创建完成后，就能通过CRUD操作对视图对象进行影响。



> 如何删除视图

```mysql
drop  view  myview；
```



对视图进行增删改查，会影响到原表数据。（通过视图影响原表数据的，不是直接操作的原表）可以对视图进行CRUD操作。



> 视图的作用

视图可以隐藏表的实现细节。保密级别较高的系统，数据库只对外提供相关的视图。（视图并不会提高检索效率）





## DBA命令

### 导入

```mysql
create  database 数据库名；
use  数据库名；
source  sql文件所在的盘符地址
```



### 导出

在Windows的dos命令窗口执行：

```mysql
mysqldump  数据库名  >盘符:\文件到处后的地址\导出后名字  -uroot  -p密码  //导出整个库
mysqldump  数据库名  表名>盘符:\文件到处后的地址\导出后名字  -uroot  -p密码  //导出指定表
```





## 数据库设计三范式

> 什么是设计范式

设计表的依据。按照这三个范式设计的表不会出现数据冗余。



> 三范式有那些

第一范式：任何一张表都应该有主键，并且每一个字段原子性不可再分。

第二范式：建立在第一范式的基础上，所有非主键字段完全依赖主键，不能产生部分依赖。

第三范式：建立在第二范式的基础上，所有非主键字段直接依赖主键，不能产生传递依赖。



注意：不要原教旨主义，在实际情况下是可以拿数据冗余去换执行效率的，需要因地制宜的设计表。