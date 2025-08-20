# Write your MySQL query statement below
select class from courses 
#where count(*) >= 5 
group by class having count(*) >= 5