delete p
from
    Person p
join
    Person pp
        on p.email = pp.email
        and p.id > pp.id;