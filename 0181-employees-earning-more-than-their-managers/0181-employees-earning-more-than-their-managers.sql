# Write your MySQL query statement below
select b.name as employee
from employee a join employee b 
on  b.managerId = a.id 
where b.salary > a.salary;