/*
Name: Mahmued Ahmed Alardawi
ID: 21352089
Section: ZJ
Course name: Programming II
Course code: CPCS 203
Assignment number: Assignment #2 (Car Insurance Claim System)
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.*;
import java.util.*;

public class ProcessClaim {
    public static void main(String[] args) throws IOException {

        /* From line(24 - 35): -
        * We created two objects of the File class.
        * We checked if they exist. */
        File inputCICSData = new File ("inputCICSData.txt");
        File inputClaims = new File ("inputClaims.txt");

        if (!inputCICSData.exists())
        {
            System.out.println("File 'inputCICSData' not found");
            System.exit(0);
        }

        else if (!inputClaims.exists())
        {
            System.out.println("File 'inputClaims' not found");
            System.exit(0);
        }


        /* From line(40 - 44): -
        * We invoked two methods, GenerateCICDatabase and GenerateClaimInvoices . */
        GenerateCICDatabase(AddCar(inputCICSData), AddOwner(inputCICSData),
                AddInsuranceCoverage(inputCICSData));

        GenerateClaimInvoices(inputClaims, AddCar(inputCICSData), AddOwner(inputCICSData),
                AddInsuranceCoverage(inputCICSData));
    }

    //

    private static Car[] AddCar(File inputCICSData) throws FileNotFoundException {

        /* From line(57 - 63): -
        * On L57 we created a scanner to read data from a file.
        * On L59 and L61 we created two one dimensional arrays, one of type Car and the other one of type String.
        * The cars classArray is used for saving the data obtained from the car array.
        * The car array is used for saving data obtained from the Scanner(input).
        * the variable cars_index is used as an index for the cars array.*/
        Scanner input = new Scanner(inputCICSData);

        Car[] cars = new Car[input.nextInt()];

        String [] car = new String[6];

        int cars_index = 0;

        /* From line(72 - 90): -
        * We made a while loop with an input.hasNext() argument, so we can go through the whole Scanner(input).
        * On L74 we used the if statement to search for the command AddCar.
        * The loop on L77 is used to add elements to the car array, so we can add them on L82? to the classArray cars.
        * We incremented the cars_index variable to go to the next index in the cars array.
        * After the loop finished we closed the Scanner(input) as seen in L87 for future use.
        * Finally, we returned the classArray cars for future use. */
        while(input.hasNext())
        {
            if(input.next().equalsIgnoreCase("AddCar"))
            {

                for(int token = 0; token < 6; token++)
                {
                    car[token] = input.next();
                }

                cars[cars_index] = new Car((car[0]), car[1], car[2], car[3], car[4], Integer.parseInt(car[5]));

                cars_index++;
            }
        }
        input.close();

        return cars;
    }

    //

    private static Owner[] AddOwner(File inputCICSData) throws FileNotFoundException {

        /* From line(104 - 117): -
         * On L106 we created a scanner to read data from a file.
         * We made the variable ownersLength to assign the length of the classArray owners,
           and we used a loop to find it from the Scanner(input).
         * On L113 and L115 we created two one dimensional arrays, one of type Owner and the other one of type String.
         * The owners classArray is used for saving the data obtained from the owner array.
         * The owner array is used for saving data obtained from the Scanner(input).
         * the variable owners_index is used as an index for the owners array.*/
        Scanner input = new Scanner(inputCICSData);

        int ownersLength = 0;

        for(int token = 0; token < 2; token++)
        {
            ownersLength = input.nextInt();
        }

        Owner[] owners = new Owner[ownersLength];

        String [] owner = new String[6];

        int owners_index = 0;

        /* From line(127 - 147): -
        * We made a while loop with an input.hasNext() argument, so we can go through the whole Scanner(input).
         * On L129 we used the if statement to search for the command AddOwner.
         * The loop on L132 is used to add elements to the owner array, so we can add them on
           L137 to the classArray owners.
         * We incremented the owners_index variable to go to the next index in the owners array.
         * After the loop finished we closed the Scanner(input) as seen in L144 for future use.
         * Finally, we returned the classArray owners for future use.*/
        while(input.hasNext())
        {
            if(input.next().equalsIgnoreCase("AddOwner"))
            {

                for(int token = 0; token < 6; token++)
                {
                    owner[token] = input.next();
                }

                owners[owners_index] = new Owner(owner[0], owner[1], owner[2],
                        new Date(Integer.parseInt(owner[3]),
                                Integer.parseInt(owner[4]) - 1, Integer.parseInt(owner[5])));

                owners_index++;
            }
        }
        input.close();

        return owners;
    }

    //

    private static InsuranceCoverage[] AddInsuranceCoverage(File inputCICSData) throws FileNotFoundException {

        /* From line(161 - 174): -
         * On 161 we created a scanner to read data from a file.
         * We made the variable insuranceCoveragesLength to assign the length of the classArray insuranceCoverages,
           and we used a loop to find it from the Scanner(input).
         * On L170 and L172 we created two one dimensional arrays, one of type InsuranceCoverage
           and the other one of type String.
         * The insuranceCoverages classArray is used for saving the data obtained from the insuranceCoverage array.
         * The insuranceCoverage array is used for saving data obtained from the Scanner(input).
         * the variable insuranceCoverages_index is used as an index for the insuranceCoverages array.*/
        Scanner input = new Scanner(inputCICSData);

        int insuranceCoveragesLength = 0;

        for(int token = 0; token < 3; token++)
        {
            insuranceCoveragesLength = input.nextInt();
        }

        InsuranceCoverage[] insuranceCoverages = new InsuranceCoverage[insuranceCoveragesLength];

        String [] insuranceCoverage = new String[3];

        int insuranceCoverages_index = 0;

        /* From line(185 - 204): -
        * We made a while loop with an input.hasNext() argument, so we can go through the whole Scanner(input).
         * On L187 we used the if statement to search for the command AddInsuranceCoverage.
         * The loop on L190 is used to add elements to the insuranceCoverage array, so we can add them on
           L195 to the classArray insuranceCoverages.
         * We incremented the insuranceCoverages_index variable to go to the next index in the insuranceCoverages array.
         * After the loop finished we closed the Scanner(input) as seen in L201 for future use.
         * Finally, we returned the classArray insuranceCoverages for future use.*/
        while(input.hasNext())
        {
            if(input.next().equalsIgnoreCase("AddInsuranceCoverage"))
            {

                for(int token = 0; token < 3; token++)
                {
                    insuranceCoverage[token] = input.next();
                }

                insuranceCoverages[insuranceCoverages_index] = new InsuranceCoverage(Integer.parseInt(insuranceCoverage[0]),
                        insuranceCoverage[1], Double.parseDouble(insuranceCoverage[2]));

                insuranceCoverages_index++;
            }
        }
        input.close();

        return insuranceCoverages;
    }

    //

    private static void GenerateCICDatabase(Car[] cars, Owner[] owners,
                                           InsuranceCoverage[] insuranceCoverages) throws FileNotFoundException {
        /* The constructors of the method GenerateCICDatabase are all the classArrays we obtained
           from the previous methods. */

        PrintWriter output = new PrintWriter("CICSData_copy.txt");
        // We created the PrintWriter(output) to print the data to the file CICSData_copy.txt.

        output.println("--------------- Welcome to CICS  Database ---------------\n\n\n");

        for(Car car : cars)
        {
            output.print("\tCar No.: " + car.getCarPlateNo());
            output.print("\tType: " + car.getCarType());
            output.print("\tBrand: " + car.getBrand());
            output.print("\tModel: " + car.getCarModel());
            output.print("\tColor: " + car.getCarColor());
            output.print("\tMfg. Year: " + car.getBuiltYear() + "\n");
            output.println("------------------------------------------------------\n");
        }
        // We went through the classArray cars and printed the obtained data on the file output.

        for(InsuranceCoverage insuranceCoverage : insuranceCoverages)
        {
            output.print("\tInsuranceCoverage Code: " + insuranceCoverage.getInsuranceCoverageCode());
            output.print("\tInsuranceCoverage Description: " +
                    insuranceCoverage.getDescription().replaceAll("_", " ") + "\n");
            output.println("------------------------------------------------------\n");
        }
        // We went through the classArray insuranceCoverages and printed the obtained data on the file output.

        for(int index = 0; index < owners.length; index++)
        {
            output.print("\tOwner ID: " + owners[index].getNationalID());
            output.println("\tName: " + owners[index].getFullName());
            if(index != owners.length - 1)
            {
                output.println("------------------------------------------------------\n");
            }

            else
            {
                output.println("------------------------------------------------------");
            }
        }
        // We went through the classArray owners and printed the obtained data on the file output.

        output.close();
        // We closed the file output for future use.
    }

    //

    private static void GenerateClaimInvoices(File inputClaims, Car[] cars, Owner[] owners,
                                             InsuranceCoverage[] insuranceCoverages) throws FileNotFoundException {
        /* The constructors of the method GenerateClaimInvoices are the file inputClaims of type File and
         all the classArrays we obtained from the previous methods. */

        Scanner input = new Scanner(inputClaims);
        // We created the scanner(input) to go through the file inputClaims.

        PrintWriter output = new PrintWriter("ClaimInvoices_copy.txt");
        // We created the PrintWriter(output) to print the data to the file ClaimInvoices_copy.txt.

        int numberOfClaims = input.nextInt();
        // We went through the Scanner to find the variable numberOfClaims.

        Claim[] claims = new Claim[numberOfClaims];
        // We created the classArray claims of type Claim and its length is the numberOfClaims.

        output.println("--------------- Welcome to Traffic Claim System ---------------\n\n");

        for(int claimNumber = 0; claimNumber < numberOfClaims; claimNumber++)
        // We created a loop to go through the Scanner(input).
        {
            claims[claimNumber] = new Claim();
            // We created a new class to each index in the classArray claims.

            output.println("Invoice No. " + claims[claimNumber].getClaimNo() + "\n");
            // We generated the invoice number from claims[claimNumber].getClaimNo().

            if(input.next().equalsIgnoreCase("ProcessClaim"))
            // We cheeked on the command ProcessClaim with an if statement.
            {
                int insuranceCoverageCode = input.nextInt();
                String carPlateNo = input.next();
                String nationalID = input.next();
                // We assigned the insuranceCoverageCode, carPlateNo, and nationalID from the scanner(input).

                claims[claimNumber].setLocation(input.next());
                claims[claimNumber].setClaimDate(new Date(input.nextInt(), input.nextInt() - 1, input.nextInt()));
                claims[claimNumber].setHasPremium(Boolean.parseBoolean(input.next()));
                claims[claimNumber].setHasSpecialOffer(Boolean.parseBoolean(input.next()));
                // we assigned data from the scanner(input) to the dataFields in the classArray claim.

                int indexOfInsuranceCoverages = 0;
                for(int index = 0; index < insuranceCoverages.length; index++)
                {
                    if(insuranceCoverages[index].getInsuranceCoverageCode() == insuranceCoverageCode)
                    {
                        indexOfInsuranceCoverages = index;
                    }
                }
                /* from this loop and if statement we cheeked which insuranceCoverageCode is used to
                   obtain data from the classArray insuranceCoverages. */

                output.println("Insurance Coverage Details");
                output.println("\tInsurance Coverage Code: " +  insuranceCoverageCode);
                output.println("\tInsurance Coverage Description: " +
                        insuranceCoverages[indexOfInsuranceCoverages].getDescription().
                                replaceAll("_", " "));
                output.printf("\tInsurance Coverage Penalty: %.1f%n%n",
                        insuranceCoverages[indexOfInsuranceCoverages].getAmount());
                /* We printed the obtained data from the classArray insuranceCoverages after we found the wanted
                   index from the previous loop.*/

                int indexOfCars = 0;
                for(int index = 0; index < cars.length; index++)
                {
                    if(cars[index].getCarPlateNo().equalsIgnoreCase(carPlateNo))
                    {
                        indexOfCars = index;
                    }
                }
                /* from this loop and if statement we cheeked which carPlateNo is used to
                   obtain data from the classArray cars. */

                output.println("Car Details");
                output.println("\tNumber Plate: " +  carPlateNo);
                output.println("\tType: " +  cars[indexOfCars].getCarType());
                output.println("\tBrand: " +  cars[indexOfCars].getBrand());
                output.println("\tModel: " +  cars[indexOfCars].getCarModel());
                output.println("\tColor: " +  cars[indexOfCars].getCarColor());
                output.println("\tBuilt Year: " +  cars[indexOfCars].getBuiltYear() + "\n");
                /* We printed the obtained data from the classArray cars after we found the wanted
                   index from the previous loop.*/

                int indexOfOwners = 0;
                for(int index = 0; index < owners.length; index++)
                {
                    if(owners[index].getNationalID().equals(nationalID))
                    {
                        indexOfOwners = index;
                    }
                }
                /* from this loop and if statement we cheeked which nationalID is used to
                   obtain data from the classArray owners. */

                output.println("Owner Details");
                output.println("\tNational ID: " +  nationalID);
                output.println("\tFull Name: " +  owners[indexOfOwners].getFullName() + "\n");
                /* We printed the obtained data from the classArray cars after we found the wanted
                   index from the previous loop.*/

                owners[indexOfOwners].increaseNumberOfClaims();
                // We incremented the dataField numberOfClaims to print it later on the file ClaimInvoices_copy.txt.

                output.println("Claim Details");
                output.println("\tDate: " + claims[claimNumber].getClaimDate().getYear() + "-" +
                        claims[claimNumber].getClaimDate().getDate() + "-" +
                        (claims[claimNumber].getClaimDate().getMonth() + 1));
                output.println("\tLocation: " + claims[claimNumber].getLocation() + "\n");
                // We printed the obtained data from the classArray claims.

                double total = insuranceCoverages[indexOfInsuranceCoverages].getAmount();
                if(claims[claimNumber].isHasPremium()) {total += 200;}
                if(claims[claimNumber].isHasSpecialOffer()) {total += 100;}
                // We cheeked if the total amount is applicable to Premium or SpecialOffer.

                LocalDate today = LocalDate.now();
                LocalDate birthday = LocalDate.of(owners[indexOfOwners].getDate().getYear(),
                        (owners[indexOfOwners].getDate().getMonth() + 1),
                        owners[indexOfOwners].getDate().getDate());
                Period age = Period.between(today, birthday);
                if(Math.abs(age.getYears()) >= 60) {total += 50;}
                // We calculated the age of the owner and cheeked wither his age is applicable for the senior offer.

                output.println("Total Amount: " + total);

                output.println("───────────────────────────────────────────────────────");
            }
        }

        output.println("--------Total claim(s) by owner--------\n");
        output.printf("%-21s", "Owner ID");
        output.printf("%-22s", "Owner Name");
        output.printf("%s%n%n", "Total Claim(s)");
        for (Owner owner : owners) {
            output.print(owner.getNationalID());
            output.printf("%21s", owner.getFullName());
            output.printf("%26d%n", owner.getNumberOfClaims());
        }
        // We printed some data obtained from the classArray claims.

        input.close();
        output.close();
        // Finally, we closed both the scanner(input) and the printWriter(output).
    }
}