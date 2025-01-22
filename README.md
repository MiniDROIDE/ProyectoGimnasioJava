# ProyectoGimnasioJava - Mejoras Implementadas

En este repositorio añadi una verificación de edad, para que los que sean menor de edad no puedan registrase. 

## Justificación de los Cambios  
Los cambios fueron realizados para mejorar la funcionalidad y seguridad del sistema:  

- **Verificación de edad**: Ahora el sistema verifica si un usuario es mayor o menor de edad antes de registrarlo.  
- **Mensajes personalizados**: Se han añadido mensajes más detallados al usuario según su edad.  
- **Código más escalable**: Se ha mejorado la estructura del método `registrarUsuario()` para permitir futuras ampliaciones.

## Instrucciones claras para entender y usar las nuevas funcionalidades

### Método `registrarUsuario(String usuario, int edad)´

Ahora este método requiere dos argumentos:

- **usuario**: El nombre del usuario que intenta registrarse en el gimnasio.
- **edad**: La edad del usuario, que se usará para verificar si es mayor de edad.

### Funcionamiento:

- Si la edad es mayor o igual a 18, el usuario podrá registrarse, y el sistema imprimirá un mensaje confirmando el registro.
- Si la edad es menor de 18, el sistema imprimirá un mensaje indicando que el usuario no puede registrarse por ser menor de edad.

### Ejemplo de uso:

En el método `main`, se crearon dos ejemplos de registro:

- `"Juan Perez", 16` (menor de edad): Este usuario no podrá registrarse debido a que su edad es menor de 18 años.
- `"Maria Gomez", 22` (mayor de edad): Este usuario sí podrá registrarse ya que es mayor de edad.

Puedes modificar los valores en el método `main` para probar otros casos de usuarios con diferentes edades.


