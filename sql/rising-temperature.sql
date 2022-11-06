select
    w.id
from
    Weather w,
    Weather ww
where
    datediff(w.recordDate , ww.recordDate ) = 1
    and w.temperature > ww.temperature;