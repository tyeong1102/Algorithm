-- 코드를 입력하세요
SELECT i.NAME, i.DATETIME
FROM ANIMAL_INS AS i
LEFT JOIN ANIMAL_OUTS AS o
ON i.ANIMAL_ID = o.ANIMAL_ID
WHERE o.DATETIME IS NULL AND i.NAME IS NOT NULL
ORDER BY i.DATETIME ASC
LIMIT 3;