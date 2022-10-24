import pkInterface.*
import pkPOO.*

fun main(args: Array<String>) {
    println( "***********  Ejercicios de Interface ****************** ")
    val iempleado:IEmpleados = IEmpleados("Empleado1","Empleado")
    iempleado._salario = 1200f
    iempleado.saludar()
    iempleado.imprimirDatos()
    iempleado.tipoPersona()
    val ialumno:IAlumnos = IAlumnos("Alumno1","Estudiante")
    ialumno.saludar()
}