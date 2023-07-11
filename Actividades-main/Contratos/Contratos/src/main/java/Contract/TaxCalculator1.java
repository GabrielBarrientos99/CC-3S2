package Contract;

public class TaxCalculator1 {
    // TaxCalculator con pre- y post-conditions implementado via asserts



    public double CalculeTax(double value)
    {
        /**
         * Calcula el valor del impuesto basado en el valor proporcionado
         * @precond: value debe ser un double mayor que cero.
         * @postcond: el valor del impuesto calculado no sera nunca un numero negativo.
         * @throws RuntimeException si el valor proporcionado es negativo

         */
        assert value>0 : "El valor proporcionado debe ser mayor que cero";
        double taxValue=0;

        assert taxValue>0 : "El valor del impuesto calculado no puede ser negativo";
        return taxValue;
    }
}
