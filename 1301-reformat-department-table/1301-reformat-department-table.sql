# Write your MySQL query statement below
select id,
MAX(case when month = 'Jan' then revenue end) as Jan_Revenue,
MAX(case when month = 'feb' then revenue end) as Feb_revenue, 
Max(case when month = 'mar' then revenue end) as Mar_Revenue,
Max(case when month = 'apr' then revenue end) as Apr_Revenue, 
Max(case when month = 'may' then revenue end) as May_Revenue, 
max(case when month = 'jun' then revenue end) as Jun_Revenue, 
max(case when month = 'jul' then revenue end) as jul_Revenue,
max(case when month = 'aug' then revenue end) as Aug_Revenue, 
max(case when month = 'sep' then revenue end) as Sep_Revenue,
max(case when month = 'oct' then revenue end) as Oct_revenue, 
max(case when month = 'Nov' then revenue end) as Nov_revenue, 
max(case when month = 'Dec' then revenue end) as Dec_revenue

from department
group by id
