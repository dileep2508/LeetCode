# Write your MySQL query statement below
select euni.unique_id as unique_id, e.name as name
from Employees e
LEFT JOIN EmployeeUNI euni
ON e.id = euni.id;