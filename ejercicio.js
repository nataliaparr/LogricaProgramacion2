function convertirTemperatura() {
    const celsiusInput = document.getElementById("gradoConveritr").value;
    const fahrenheit = celsiusInput * 9/5 + 32;
    const kelvin= parseFloat(celsiusInput)+ 273.15;

    document.getElementById("gradosEnFahrenheit").textContent = "Grados Fahrenheit:" + fahrenheit;
    document.getElementById("gradosEnKelvin").textContent = "Grados Kelvin:" + kelvin;

}

