# FERME AIGRICOLE
## GESTION ANIMALE (soins véto, stock de bouffe, castration)
> C R U D ANIMAUX
### Controller
1. AnimalController : 
   - GET : getOneAnimal, getAllAnimal
   - POST : createAnimal
   - DELETE : deleteAnimal
   - PATCH : patchAnimal
### Entité
1. Entité Animal :
   1. Propriété:
        - Espèce
        - Nom
        - Age
        - Logement
### DTO
1. DTO Animal:
   1. Propriété: 
        - Espèce
        - Nom
        - Age
        - Logement
### MAPPER
1. Animal Mapper
### Repositories
1. Animal Repository
### SERVICES
1. AnimalService -> Interface -> Signature des méthodes du CRUD
2. AnimalServiceImpl -> Classe -> Impléments AnimalService -> Implémentation des méthodes du CRUD
## STOCK MAGASIN
> C R U D de produits 
### Controller
1. ProductController : 
   - GET : getOne, getAllProduct
   - POST : createProduct
   - DELETE : deleteProduct
   - PATCH : patchProduct
### Entité
1. Entité Product :
   1. Propriété:
        - Nom
        - Quantité
### DTO
1. DTO Product:
   1. Propriété: 
        - Nom
        - Quantité
### MAPPER
1. Product Mapper
### Repositories
1. Product Repository
### SERVICES
1. ProductService -> Interface -> Signature des méthodes du CRUD
2. ProductServiceImpl -> Classe -> Impléments ProductService -> Implémentation des méthodes du CRUD
