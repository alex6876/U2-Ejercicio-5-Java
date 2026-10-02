# 🏠 Simulación de Hub de Domótica Inteligente (POO en Java)

Este proyecto es una simulación en Java que modela un sistema centralizado de control para un hogar inteligente (*Smart Home*). Pone en práctica conceptos fundamentales de la **Programación Orientada a Objetos (POO)** como el control de estado de los objetos, la interacción entre componentes y la verificación de referencias nulas en memoria.

---

## 🧩 Clases y Estructura del Sistema

El proyecto está compuesto por 3 clases principales:

*   **`DispositivoInteligente`**: Representa cada aparato conectado al sistema (ej. luces, aire acondicionado, persianas).
    *   **Atributos de estado:** `nombre`, `conectado` (si tiene señal/red) y `encendido` (estado de energía).
    *   **Métodos:** `encender()`, `apagar()`, `configurar()`, entre otros auxiliares para validar su estado antes de ejecutar una orden.
*   **`HubCentral`**: Actúa como el controlador principal de la casa.
    *   Almacena las referencias de hasta 3 dispositivos inteligentes.
    *   Implementa rutinas automatizadas como `activarModoNoche()`, que apaga secuencialmente los dispositivos que se encuentren conectados.
*   **`Main`**: Punto de entrada del programa. Instancia los dispositivos con diferentes estados, los registra en el Hub y ejecuta la prueba del "Modo Noche".

---

## ⚙️ Lógica de Control de Estado y Validaciones

El sistema aplica reglas lógicas directas basadas en los atributos del objeto:

1. **Verificación de Red:** Un dispositivo solo puede encenderse o configurarse si `conectado == true`.
2. **Control de Apagado Centralizado (`activarModoNoche`):** 
   * Comprueba primero que la referencia al dispositivo no sea `null` (`dispositivo != null`).
   * Valida si el dispositivo está conectado (`estaConectado()`).
   * Si ambas condiciones se cumplen, manda la señal de apagado al objeto correspondiente.

---

## 💻 Salida por Consola

Al ejecutar el método `main`, el programa simula la activación de dispositivos y el apagado masivo nocturno:

```text
Aire acondicionado encendido
Foco Dormitorio encendido
============= Activando Modo Noche =============
Aire acondicionado apagado.
Foco Dormitorio apagado.
