# Write your MySQL query statement below
select S.student_id, S.student_name, Sub.subject_name, count(E.subject_name) AS attended_exams
from Students S
CROSS JOIN Subjects Sub LEFT OUTER JOIN Examinations E
ON S.student_id = E.student_id AND Sub.subject_name = E.subject_name
GROUP BY S.student_id, S.student_name, Sub.subject_name 
ORDER BY S.student_id, Sub.subject_name;