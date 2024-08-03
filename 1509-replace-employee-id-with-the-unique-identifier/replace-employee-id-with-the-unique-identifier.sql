select p.unique_id, u.name from 
Employees u left join  EmployeeUNI p
on u.id = p.id 
