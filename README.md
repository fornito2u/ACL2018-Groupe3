# A Maze Zone (ACL Groupe 3)

## Auteurs

Marvin Fornito, Victor DARMOIS, Clément BELLANGER, Clément KOCH

## Pré-requis

Java 8, Ant

### Installer ant sous windows :

- Sur le site officiel : https://ant.apache.org/bindownload.cgi
	* Dézipper l'archive "apache-ant-1.10.5-bin.zip"
	* Ajouter le chemin à la variable PATH
		* Copier le dossier "apache-ant-1.10.5" à la racine du disque "C:\"
		* Par exemple exécuter "SystemPropertiesAdvanced.exe"
		* Puis changer le Path (utilisateur ou système) et ajouter "C:\apache-ant-1.10.5\bin;"
		* (Les valeurs doivent être séparés par des point-virgules)
- Avec le gestionnaire de paquets chocolatey (voir https://chocolatey.org/install)
	* Exécuter avec les droits d'administrateur  "choco install ant -Y"

- Sans droits admin
	* Se placer dans le dossier du projet (celui avec le build.xml) et exécuter "$chemin\apache-ant-1.10.5\bin\ant"

### Installer les dépendances sous linux :

#### RedHat/Fedora

sudo dnf install ant

#### Debian/Ubuntu

sudo apt-get install default-jdk
	
## Lancement (et compilation)

ant run

## Lancement avec tests (et compilation)

ant tests

## Nettoyage

ant clean

## Notes pour les IDE

Penser à ajouter "lib\junit-platform-console-standalone-1.3.1.jar" au classpath lors de la compilation
(Sous Eclipse Propetries -> Java Build Path -> Libraries -> Add External JARs...)

