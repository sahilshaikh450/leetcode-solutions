# Write your MySQL query statement below
SELECT MAX(salary) as SecondHighestSalary
from Employee
where salary not in (select max(salary) from Employee);