#Query 1 Inserimento di un nuovo utente

INSERT INTO Contatto (cf,nome,cognome,email,indirizzo)values 
					('rccfnc88L05f205','francesco','riccaoordo','francescoriccardo198@gmail.com','via roma 14');

#Query 2 Visualizzazione delle informazioni anagrafiche e del modello di telefono posseduto 

Select c.cf,c.nome,c.cognome,c.indirizzo,s.name as modello
from contatto as c,smartphone as s 
where c.cf=s.contatto; 

#Query 3  Update sia delle informazioni anagrafiche che del telefono 

update contatto
inner join
smartphone
on
contatto.cf=smartphone.contatto

SET contatto.email=' ',contatto.indirizzo=' ',smartphone.ram=' ',smartphone.cpu=' '
where contatto.cf='hipavp86s5bersg';

#query 4 Visualizzazione tutte le informazioni relative al telefono in base al numero 
Select *
from smartphone
where numero='32548752';

          