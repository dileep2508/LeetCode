# Write your MySQL query statement below

select p.project_id, round(AVG(experience_years), 2) AS average_years
from Project p
LEFT JOIN employee e
ON p.employee_id = e.employee_id
group by p.project_id;