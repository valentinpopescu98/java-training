select vali_schema.student.student_id, vali_schema.student.nume, vali_schema.student.grupa, vali_schema.examen.materie, vali_schema.examen.data
from vali_schema.student
inner join vali_schema.examen on vali_schema.student.grupa = vali_schema.examen.grupa
inner join vali_schema.nota_examen on vali_schema.examen.examen_id = vali_schema.nota_examen.examen_id
where vali_schema.nota_examen.nota < 5;