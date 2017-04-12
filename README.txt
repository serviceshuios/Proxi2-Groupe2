Consignes d'installation et d'ex�cution de l'application ProxibanqueSI-GOPE

1/ D�compressez le fichier .rar re�u dans le dossier de votre choix. Cette archive contient un .war qui vous servira � lancer l'application. 
	Notez bien le dossier dans lequel vous l' avez extraite.

2/ V�rifiez que la JRE (Java Runtime Environment) est bien install�e sur votre poste de travail.
	Pour cela, tapez dans l'invite de commande "java -version".
	Si aucune JRE ne s'affiche :
	2.1/ Vos variables d'environnement ne sont peut-�tre pas les bonnes.
		Avec un clic droit, allez dans les propri�t�s de c:/, Param�tres syst�me avanc�es > Variables d'environnement.
		Cliquer sur  "Nouvelle..." si aucune variable PATH n'existe et cr�ez la de la mani�re suivante :
		Mettez "PATH" comme nom de variable et %JAVA_HOME%\bin comme valeur
		Si la variabe PATH existe d�j�, modifier-la simplement en rajouter %JAVA_HOME%\bin apr�s un point virgule dans ses valeurs.
		
	2.2/ Si apr�s v�rification vous n'avez toujours pas de JRE, son installation est n�cessaire.
		Pensez �  noter le type de syst�me de votre poste de travail (32 ou 64 bits). Pour cela, aller dans D�marrer, clic droit sur ordinateur, propri�t�s.
		Vous trouverez ce qu'il vous faut ici : http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html
		
	2.3/ V�rifiez que le point 2.1/ soit effectif
	
3/ Mise en place du serveur d'application :
	3.1/ T�l�chargez (si vous ne l'avez pas d�j�), le serveur Tomcat 9 selon les propri�t�s de votre poste de travail. 
		 Lien pour la page de t�l�chargement : http://tomcat.apache.org/download-90.cgi
		 
	3.2/ D�zipper le fichier t�l�charg� et placer le dossier apache-tomcat-9.0.0.M19 obtenu dans le dossier de votre choix.
		
	3.2/ Pr�cisez les variables d'environnement. Dans l'invit de commande, pointer sur le dossier bin contenu dans le dossier apache-tomcat-9.0.0.M19 pr�c�demment t�l�charg� et d�compress� dans le dossier de votre choix.
			Puis �crivez la commande suivante : SET JRE_HOME="chemin de votre JRE" (le dossier JRE se situe souvent dans ProgramFiles>Java).
			
4/ Mise en place de la base de donn�es :
	4.1/ T�l�chargez (si vous ne l'avez pas d�j�), wampserver. 
		Lien pour la page de t�l�chargement : http://www.wampserver.com/#download-wrapper
	4.2/ Lancez le .exe contenu dans le dossier que vous venez de t�l�charger.
	4.3/ Faites un clic droit sur l'ic�ne verte apparue en bas � droite de votre �cran, puis clic droit sur phpMyAdmin.
	4.4/ Rentrez l'identifiant "root", en laissant le champ mot de passe vide.
	4.5/ Cr�ez une base de donn�e gr�ce � l'option "nouvelle base de donn�es"
	4.6/ Importez le fichier en .mySQL re�u dans le dossier de livraison.
	
5/ Pointer la direction de l'invite de commande sur le dossier contenant le fichier .war de l'application ProxiBanque
	gr�ce � la commande de l'invite commande suivante :
	"cd "chemin du dossier""
	
6/ Vous pouvez v�rifier le contenu du nouveau dossier point� gr�ce � la commande "dir" dans l'invite de commande.
	Le fichier ProxiBanqueSIV1.war doit s'afficher dans l'invite commande.
	
7/ Placez le fichier .war dans le dossier webapps du dossier tomcat 9.0.0.M19 (voir 3.2/).

8/ Dans le dossier bin du dossier apache-tomcat-9.0.0.M19, lancer l'application en double-cliquant sur startup.bat


N'h�sitez pas � regarder les fonctionalit�s de l'application gr�ce � notre Javadoc

Merci de votre confiance