# Write your MySQL query statement below
Select w1.Id
from Weather w1, Weather w2
Where DATEDIFF(w1.recordDate, w2.recordDate) = 1
AND w1.temperature > w2.temperature;
