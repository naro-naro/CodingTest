SELECT ANIMAL_OUTS.ANIMAL_ID AS ANIMAL_ID, 
    ANIMAL_OUTS.NAME AS NAME
    
FROM ANIMAL_INS RIGHT JOIN ANIMAL_OUTS
    ON ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID
    
WHERE ANIMAL_INS.ANIMAL_ID IS NULL