# Write your MySQL query statement below
Select s.user_id, round(avg(IF(c.action = 'confirmed' ,1,0)),2) AS confirmation_rate
from Signups s
left join Confirmations c using (user_id)
group by s.user_id;