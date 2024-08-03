select p.unique_id, u.name from 
EmployeeUNI p  right join Employees u
on p.id = u.id 
