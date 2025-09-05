# Write your MySQL query statement below
select department.name as Department , e.name as Employee, e.salary from employee e 
inner join (select name , departmentId, max(salary) as max_salary from employee group by departmentId) v
on e.departmentId = v.departmentId and e.salary = v.max_salary 
inner join department on e.departmentId = department.id