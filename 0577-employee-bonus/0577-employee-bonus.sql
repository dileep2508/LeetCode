# Write your MySQL query statement below
select name, bonus
from Employee
LEFT JOIN Bonus
ON Employee.empId = Bonus.empId
where Bonus < 1000 OR Bonus is null;


