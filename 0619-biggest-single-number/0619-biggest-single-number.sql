# Write your MySQL query statement below
select MAX(num) AS num
from MyNumbers
where num IN (
    select num
    from MyNumbers
    group by num
    Having count(*) = 1
);

