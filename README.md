# Mejoras en el Sistema del Gimnasio

## Descripción general de las mejoras

En este repositorio se han añadido mejoras al sistema de gestión del gimnasio. Se ha integrado una nueva funcionalidad que incluye una clase adicional para gestionar la cafetería del gimnasio. Esta nueva funcionalidad permite mostrar un menú de la cafetería, así como atender a los clientes que la visitan.

## Justificación de los cambios realizados

La incorporación de la cafetería al sistema tiene como objetivo ampliar la experiencia del usuario dentro del gimnasio. Ahora, no solo se pueden gestionar las actividades y los registros de los usuarios en el gimnasio, sino también el servicio de la cafetería, lo que mejora la experiencia integral del cliente.

Los cambios realizados permiten a los usuarios interactuar tanto con el gimnasio como con la cafetería, proporcionando un entorno más completo.

## Instrucciones claras para entender y usar las nuevas funcionalidades

1. **Clase `Gimnasio`**:
   - La clase `Gimnasio` sigue gestionando las actividades disponibles y el registro de usuarios.
   - Las actividades disponibles se muestran cuando se llama al método `mostrarActividades()`.
   - Los usuarios se pueden registrar en el gimnasio mediante el método `registrarUsuario()`.

2. **Clase `Cafeteria`**:
   - Se ha añadido la clase `Cafeteria`, que incluye un menú de productos y un método para atender a los clientes.
   - El menú se muestra al llamar al método `mostrarMenu()`.
   - Los clientes se pueden atender mediante el método `atenderCliente()`.

3. **Integración en el `main`**:
   - En el método `main`, después de registrar un usuario en el gimnasio, también se muestra el menú de la cafetería y se atiende al cliente.

### Uso del código

1. Al ejecutar el programa, se verán las actividades disponibles en el gimnasio, el menú de la cafetería y un mensaje de atención al cliente.
2. Puedes modificar el nombre de las actividades o el menú según lo desees.
3. Para agregar más funcionalidades, puedes crear nuevos métodos en las clases `Gimnasio` o `Cafeteria`.

## Uso de GitHub

- **Commit 1**: Se añadió la clase `Cafeteria` con los métodos `mostrarMenu()` y `atenderCliente()`.
  - Mensaje de commit: `Añadida la clase Cafeteria con funcionalidades básicas (menú y atención al cliente).`

- **Commit 2**: Se integró la clase `Cafeteria` en el `main` para que se muestre el menú y se atienda al cliente.
  - Mensaje de commit: `Integración de la clase Cafeteria en el main para gestionar la atención al cliente.`
