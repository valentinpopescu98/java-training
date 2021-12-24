select s.student_id, s.nume, s.grupa, e.materie, e.data
from vali_schema.student s
inner join vali_schema.examen e on s.grupa = e.grupa
inner join vali_schema.nota_examen n on e.examen_id = n.examen_id
where n.nota < 5;
