--Questão 1
SELECT P.Nome AS Pais, C.Nome AS Cultura,
       SUM(Prod.Quantidade) AS Producao_Total,
       SUM(Cons.Quantidade) AS Consumo_Total,
       SUM(Desp.Quantidade) AS Desperdicio_Total
FROM PF0645.Producao AS Prod
INNER JOIN PF0645.Paises AS P ON Prod.ID_Pais = P.ID_Pais
INNER JOIN PF0645.Culturas AS C ON Prod.ID_Cultura = C.ID_Cultura
LEFT JOIN PF0645.Consumo AS Cons ON Prod.ID_Pais = Cons.ID_Pais AND Prod.ID_Cultura = Cons.ID_Cultura
LEFT JOIN PF0645.Desperdicio AS Desp ON Prod.ID_Pais = Desp.ID_Pais AND Prod.ID_Cultura = Desp.ID_Cultura
GROUP BY P.Nome, C.Nome
ORDER BY P.Nome;


--Questão 2
CREATE VIEW CONSUMO_BRASIL AS
SELECT Cul.Nome AS Cultura, SUM(Cons.Quantidade) AS ConsumoTotal
FROM PF0645.Consumo AS Cons
INNER JOIN PF0645.Paises AS Pai ON Cons.ID_Pais = Pais.ID_Pais
INNER JOIN PF0645.Culturas AS Cul ON Cons.ID_Cultura = Cul.ID_Cultura
WHERE Pais.Nome = 'Brasil'
GROUP BY Cul.Nome;

--Questão 3
INSERT INTO PRODUCAO_0_7500
SELECT * FROM PF0645.Producao
WHERE Quantidade BETWEEN 0 AND 7500;

INSERT INTO PRODUCAO_7501_10000
SELECT * FROM PF0645.Producao
WHERE Quantidade BETWEEN 7501 AND 10000;

INSERT INTO PRODUCAO_10001_20000
SELECT * FROM PF0645.Producao
WHERE Quantidade BETWEEN 10001 AND 20000;

--Questão 4
WITH Consumo_Paises AS (
  SELECT Pais.Nome AS Pais, SUM(Cons.Quantidade) AS Consumo_Total
  FROM PF0645.Consumo AS Cons
  INNER JOIN PF0645.Paises AS Pai ON Cons.ID_Pais = Pais.ID_Pais
  GROUP BY Pais.Nome
)
SELECT Pais, Consumo_Total
FROM Consumo_Paises
WHERE Consumo_Total > (SELECT AVG(Consumo_Total) FROM Consumo_Paises);
