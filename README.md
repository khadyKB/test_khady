* Instructions:

L’aspirateur doit pouvoir parcourir l'intégralité d’une pièce donnée, sa position est représentée par ses coordonnées (x,y) et d'une lettre indiquant l'orientation selon la notation cardinale anglaise (N,E,W,S). Une pièce est modélisée par une grille rectangulaire.

Par exemple, l’aspirateur peut se trouver dans la position « 0, 0, N », ce qui signifie qu’il se situe dans le coin inférieur gauche de la pièce, et orientée vers le Nord.

Pour contrôler l’aspirateur, une séquence de commandes symbolisée par une suite de lettres lui est envoyée. Les commandes possibles sont « D », « G » et « A ». « D » et « G » font pivoter l’aspirateur de 90° à droite ou à gauche respectivement, sans la déplacer. « A » signifie que l'on avance d'une case dans la direction à laquelle elle fait face, et sans modifier son orientation.

On définit que la case directement au Nord de la position (x, y) a pour coordonnées (x, y+1).

Pour programmer l’aspirateur, on lui fournit des données en entrée:

Les dimensions de la grille à savoir le nombre de carrés sur l’axe x puis y.
La position initiale de l’aspirateur, ainsi que son orientation.
Une série d'instructions que l’aspirateur exécutera.

Lorsque l’aspirateur achève une série d'instruction, il communique sa position et son orientation.


* Tests:

  1. Pour tester le programme, veuillez cloner le repo actuel en faisans un 
  ----
  git clone git@github.com:khadyKB/test_khady.git
  ----
  2. Ensuite, un jar est deja genere est est present dans test_khady/target et se nomme **yanport_test-1.0.0.jar**, veuillez vous positionner dans test_khady/target
  3. Lancer la commande
  INFO: Le programme est concu pour demander directement les informations necessaires via le terminal. En lancant la commande ci-dessous, plusieurs messages seront affichées afin de recuperer les entrées
  ----
  java-jar yanport_test-1.0.0.jar
  ----
  4. L'execution de la commande permettra de saisir:
  ** La valeur de X
  ** La valeur de Y
  ** L'orientation de départ
  ** Les instructions
  
  Exemple:
  <img width="1058" alt="Screen Shot 2022-04-14 at 20 53 15" src="https://user-images.githubusercontent.com/45995106/163473502-a558d350-3b02-4d1d-ab60-f2b9a59a8aa5.png">

  
