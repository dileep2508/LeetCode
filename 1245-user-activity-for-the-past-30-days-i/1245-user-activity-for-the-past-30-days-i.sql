# Write your MySQL query statement below
select activity_date AS day, count(distinct user_id) AS active_users 
from Activity
where activity_date BETWEEN '2019-06-28' AND '2019-07-27'
group by activity_date;
