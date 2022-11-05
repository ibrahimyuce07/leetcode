create function getNthHighestSalary(N int) RETURNS INT
BEGIN
set n = n-1;
  return (
      select distinct(salary)
      from employee
      order by salary desc
      limit 1 offset n
  );
end