SELECT s.student_id, s.nume, s.grupa grupaS, e.examen_id, e.materie, e.data, e.grupa grupaE, n.nota
FROM vali_schema.student s
INNER JOIN vali_schema.nota_examen n ON s.student_id = n.student_id
INNER JOIN vali_schema.examen e ON n.examen_id = e.examen_id
WHERE n.nota < 5 OR n.nota IS NULL;