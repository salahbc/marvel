
INSERT INTO team (teamId, name, dateCreation) VALUES (0, 'Aucun Team','2019-10-01');
INSERT INTO team (teamId, name, dateCreation) VALUES (1, 'Avengers','2019-10-01');
INSERT INTO team (teamId, name, dateCreation) VALUES (2, 'X-MEN','2019-10-01');
INSERT INTO team (teamId, name, dateCreation) VALUES (3, 'Fantastic Four','2019-10-01');
INSERT INTO team (teamId, name, dateCreation) VALUES (4, 'Defenders','2019-10-01');
INSERT INTO team (teamId, name, dateCreation) VALUES (5, 'Hydra','2019-10-01');
INSERT INTO team (teamId, name, dateCreation) VALUES (6, 'Star Forge','2019-10-01');




INSERT INTO hero (id, name, vignette, description,teamId) VALUES (1, 'Wolverine','wolv.png',"Logan, alias Wolverine, est un super-héros évoluant dans l'univers Marvel de la maison d'édition Marvel Comics.",0);
INSERT INTO hero (id, name, vignette, description,teamId) VALUES (2, 'Spider-Man','spider.png', "Spider man, est un super-héros évoluant dans l'univers Marvel de la maison d'édition Marvel Comics.",0);
INSERT INTO hero (id, name, vignette, description,teamId) VALUES (3, 'Thor','thor.png', "Spider man, est un super-héros évoluant dans l'univers Marvel de la maison d'édition Marvel Comics.",0);
INSERT INTO hero (id, name, vignette, description,teamId) VALUES (4, 'Iron Man','iron.png', "Spider man, est un super-héros évoluant dans l'univers Marvel de la maison d'édition Marvel Comics.",0);
INSERT INTO hero (id, name, vignette, description,teamId) VALUES (5, 'Hulk','hulk.png', "Spider man, est un super-héros évoluant dans l'univers Marvel de la maison d'édition Marvel Comics.",0);
INSERT INTO hero (id, name, vignette, description,teamId) VALUES (6, 'Captain America','captain.png',"Spider man, est un super-héros évoluant dans l'univers Marvel de la maison d'édition Marvel Comics.",0);



INSERT INTO comic (comicId, name,description) VALUES (1, 'Spider-Man',"Peter Parker, alias Spider-Man, est un super-héros évoluant dans l'univers Marvel de la maison d'édition Marvel Comics. Créé par le scénariste Stan Lee et le dessinateur Steve Ditko, le personnage de fiction apparaît pour la première fois dans le comic book Amazing Fantasy #15 en 1962");

INSERT INTO comic (comicId, name,description) VALUES (2, 'Iron-Man',"Anthony « Tony » Stark, alias Iron Man est un super-héros évoluant dans l'univers Marvel de la maison d'édition Marvel Comics.");


INSERT INTO comic (comicId, name,description) VALUES (3, 'Thor',"Au royaume d'Asgard, Thor est un guerrier aussi puissant qu'arrogant.");

INSERT INTO comic (comicId, name,description) VALUES (4, 'Avengers',"Le Titan Thanos, ayant réussi à s'approprier les six Pierres d'Infinité et à les réunir sur le Gantelet doré");



INSERT INTO comic (comicHeroLinkId, comicId,dateCroissement,idHero) VALUES (1, 1,'2019-10-01',1);

INSERT INTO comic (comicHeroLinkId, comicId,dateCroissement,idHero) VALUES (2, 1,'2019-10-01',2);

INSERT INTO comic (comicHeroLinkId, comicId,dateCroissement,idHero) VALUES (3, 2,'2019-10-01',3);

INSERT INTO comic (comicHeroLinkId, comicId,dateCroissement,idHero) VALUES (4, 2,'2019-10-01',4);

INSERT INTO comic (comicHeroLinkId, comicId,dateCroissement,idHero) VALUES (5, 3,'2019-10-01',5);


INSERT INTO comic (comicHeroLinkId, comicId,dateCroissement,idHero) VALUES (6, 3,'2019-10-01',6);



 

 

 

 