-- 코드를 입력하세요
SELECT
    ai.animal_id,
    ai.animal_type,
    ai.name
FROM animal_outs ao
JOIN animal_ins ai
ON ai.animal_id = ao.animal_id
WHERE ai.sex_upon_intake != ao.sex_upon_outcome
ORDER BY ai.animal_id