# Write your MySQL query statement below
select Person.firstName,lastName,
Address.city,state
from Person
left join Address
on Person.personId = Address.personId;
