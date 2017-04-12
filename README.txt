Consignes d'installation et d'exécution de l'application ProxibanqueSI-GOPE

1/ Décompressez le fichier .rar reçu dans le dossier de votre choix. Cette archive contient un .war qui vous servira à lancer l'application. 
	Notez bien le dossier dans lequel vous l' avez extraite.

2/ Vérifiez que la JRE (Java Runtime Environment) est bien installée sur votre poste de travail.
	Pour cela, tapez dans l'invite de commande "java -version".
	Si aucune JRE ne s'affiche :
	2.1/ Vos variables d'environnement ne sont peut-être pas les bonnes.
		Avec un clic droit, allez dans les propriétés de c:/, Paramètres système avancées > Variables d'environnement.
		Cliquer sur  "Nouvelle..." si aucune variable PATH n'existe et créez la de la manière suivante :
		Mettez "PATH" comme nom de variable et %JAVA_HOME%\bin comme valeur
		Si la variabe PATH existe déjà, modifier-la simplement en rajouter %JAVA_HOME%\bin après un point virgule dans ses valeurs.
		
	2.2/ Si après vérification vous n'avez toujours pas de JRE, son installation est nécessaire.
		Pensez à  noter le type de système de votre poste de travail (32 ou 64 bits). Pour cela, aller dans Démarrer, clic droit sur ordinateur, propriétés.
		Vous trouverez ce qu'il vous faut ici : http://www.oracle.com/technetwork/java/javase/downloads/jre8-downloads-2133155.html
		
	2.3/ Vérifiez que le point 2.1/ soit effectif
	
3/ Mise en place du serveur d'application :
	3.1/ Téléchargez (si vous ne l'avez pas déjà), le serveur Tomcat 9 selon les propriétés de votre poste de travail. 
		 Lien pour la page de téléchargement : http://tomcat.apache.org/download-90.cgi
		 
	3.2/ Dézipper le fichier téléchargé et placer le dossier apache-tomcat-9.0.0.M19 obtenu dans le dossier de votre choix.
		
	3.2/ Précisez les variables d'environnement. Dans l'invit de commande, pointer sur le dossier bin contenu dans le dossier apache-tomcat-9.0.0.M19 précédemment téléchargé et décompressé dans le dossier de votre choix.
			Puis écrivez la commande suivante : SET JRE_HOME="chemin de votre JRE" (le dossier JRE se situe souvent dans ProgramFiles>Java).
			
4/ Mise en place de la base de données :
	4.1/ Téléchargez (si vous ne l'avez pas déjà), wampserver. 
		Lien pour la page de téléchargement : http://www.wampserver.com/#download-wrapper
	4.2/ Lancez le .exe contenu dans le dossier que vous venez de télécharger.
	4.3/ Faites un clic droit sur l'icône verte apparue en bas à droite de votre écran, puis clic droit sur phpMyAdmin.
	4.4/ Rentrez l'identifiant "root", en laissant le champ mot de passe vide.
	4.5/ Créez une base de donnée grâce à l'option "nouvelle base de données"
	4.6/ Importez le fichier en .mySQL reçu dans le dossier de livraison.
	
5/ Pointer la direction de l'invite de commande sur le dossier contenant le fichier .war de l'application ProxiBanque
	grâce à la commande de l'invite commande suivante :
	"cd "chemin du dossier""
	
6/ Vous pouvez vérifier le contenu du nouveau dossier pointé grâce à la commande "dir" dans l'invite de commande.
	Le fichier ProxiBanqueSIV1.war doit s'afficher dans l'invite commande.
	
7/ Placez le fichier .war dans le dossier webapps du dossier tomcat 9.0.0.M19 (voir 3.2/).

8/ Dans le dossier bin du dossier apache-tomcat-9.0.0.M19, lancer l'application en double-cliquant sur startup.bat


N'hésitez pas à regarder les fonctionalités de l'application grâce à notre Javadoc

Merci de votre confiance