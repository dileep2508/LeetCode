# Write your MySQL query statement below
select query_name, round(avg(cast(rating AS Decimal) / position), 2) AS quality,
round(sum(case when rating < 3 then 1 else 0 end) * 100 / count(*), 2) AS poor_query_percentage
from Queries 
group by query_name;
