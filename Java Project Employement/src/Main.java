import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
// LI01-Saturday-0700 Emplyoment
// I MADE GANAL ASMARA JAYA - 2201799386
// WILSON ADRILIA - 2201820502
// ANDREAS WIJAYA - 2201734120
// ARIEL SETIAWAN - 2201794574
// JASON STANLY WINGI - 2201795860

public class Main
{
	public boolean isValidDate(String date)
	{	    
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	    Date testDate = null;
	    
		try
	    {
	      testDate = sdf.parse(date);
	    }

	    catch (ParseException e)
	    {
	      System.out.println("Invalid Date Format !");
	      return false;
	    }

	    if (!sdf.format(testDate).equals(date)) 
	    {
	      System.out.println("Invalid Date !");
	      return false;
	    }

	    return true;
	}
	
	public Main() 
	{
		Scanner scan = new Scanner(System.in);
		int choose = 0;
		
		String name = "", birth = "", id = "", division = "", level = "", type = "";
		String contractDate = "", employementDate = "";
		int contractLength = 0, insurance = 0, num = 0; 
		boolean exist = false; String yn = "";
		
		Vector<Contract> vecContract = new Vector<>();
		Vector<Permanent> vecPermanent = new Vector<>();
		
		name = "Elsen Chandra";
		birth = "05/23/2000";
		division = "IT";
		level = "Staff";
		type = "Contract";
		do
		{
			id = "C-" + (int)(Math.random()*10) + (int)(Math.random()*10) + (int)(Math.random()*10);
						
			for (int i = 0; i < vecContract.size(); i++) 
			{
				if(vecContract.get(i).getId().equals(id))
				{
					System.out.println("ID Exist @Contract !");
					exist = true; break;
				}
				else exist = false;
			}				
		} while (exist != false);
		contractDate = "09/17/2020";
		contractLength = 18;
		Contract ctr = new Contract();
		ctr.setName(name);
		ctr.setBirth(birth);
		ctr.setId(id);
		ctr.setDivision(division);
		ctr.setLevel(level);
		ctr.setContractDate(contractDate);
		ctr.setContractLength(contractLength);
		vecContract.add(ctr);

		name = "Kevin Aldri";
		birth = "07/30/2000";
		division = "Marketing";
		level = "Manager";
		type = "Permanent";
		do
		{
			id = "P-" + (int)(Math.random()*10) + (int)(Math.random()*10) + (int)(Math.random()*10);
						
			for (int i = 0; i < vecPermanent.size(); i++) 
			{
				if(vecPermanent.get(i).getId().equals(id))
				{
					System.out.println("ID Exist @Permanent !");
					exist = true; break;
				}
				else exist = false;
			}				
		} while (exist != false);
		employementDate = "06/11/2019";
		insurance = 2000;
		Permanent prm = new Permanent();
		prm.setName(name);
		prm.setBirth(birth);
		prm.setId(id);
		prm.setDivision(division);
		prm.setLevel(level);
		prm.setEmployementDate(employementDate);
		prm.setInsurance(insurance);
		vecPermanent.add(prm);

		do
		{
			for (int i = 0; i < 30; i++) System.out.println();
			
			System.out.println("Employee Management System");
			System.out.println("===========================");
			System.out.println("1. Input Employee Data");
			System.out.println("2. Search Employee Data");
			System.out.println("3. Update Employee Data");
			System.out.println("4. Delete Employee Data");
			System.out.println("5. Exit Program");
			
			choose = scan.nextInt();
			scan.nextLine();
			
			if(choose == 1)
			{
				do
				{
					System.out.print("Input Name [5...30]: ");
					name = scan.nextLine();
				} while (name.length()<5 || name.length()>30);
				
				do 
				{
					System.out.print("Input Birth Date [MM/DD/YYYY] : ");
					birth = scan.nextLine();
				} while (isValidDate(birth) != true);
				
				do 
				{
					System.out.print("Input Division [IT / Marketing / Management] : ");
					division = scan.nextLine();
				} while (!division.equals("IT") && !division.equals("Marketing") && !division.equals("Management"));
				
				do 
				{
					System.out.print("Input Level [Staff / Manager / Director] : ");
					level = scan.nextLine();
				} while (!level.equals("Staff") && !level.equals("Manager") && !level.equals("Director"));
				
				do 
				{
					System.out.print("Input Type [Contract / Permanent] : ");
					type = scan.nextLine();
				} while (!type.equals("Contract") && !type.equals("Permanent"));
				
				if(type.equals("Contract")) 
				{
					do
					{
						id = "C-" + (int)(Math.random()*10) + (int)(Math.random()*10) + (int)(Math.random()*10);
						
						for (int i = 0; i < vecContract.size(); i++) 
						{
							if(vecContract.get(i).getId().equals(id))
							{
								System.out.println("ID Exist @Contract !");
								exist = true; break;
							}
							else exist = false;
						}
						
					} while (exist != false);
					
					do 
					{
						System.out.print("Input Contract Date [MM/DD/YYYY] : ");
						contractDate = scan.nextLine();
					} while (isValidDate(contractDate) != true);
					
					do
					{
						System.out.print("Input Contract Length [6/12/18/24] : ");
						contractLength = scan.nextInt();
						scan.nextLine();
					} while (contractLength != 6 && contractLength != 12 && contractLength != 18 && contractLength != 24);
					
					Contract ctr2 = new Contract();
					ctr2.setName(name);
					ctr2.setBirth(birth);
					ctr2.setId(id);
					ctr2.setDivision(division);
					ctr2.setLevel(level);
					ctr2.setContractDate(contractDate);
					ctr2.setContractLength(contractLength);
					vecContract.add(ctr2);
					
					System.out.println("Input Successful !");
					System.out.println("Press ENTER ...");
					scan.nextLine();
				} 
				if(type.equals("Permanent"))
				{
					do
					{
						id = "P-" + (int)(Math.random()*10) + (int)(Math.random()*10) + (int)(Math.random()*10);
						
						for (int i = 0; i < vecPermanent.size(); i++) 
						{
							if(vecPermanent.get(i).getId().equals(id))
							{
								System.out.println("ID Exist @Permanent !");
								exist = true; break;
							}
							else exist = false;
						}
						
					} while (exist != false);
					
					do 
					{
						System.out.print("Input Employement Date [MM/DD/YY] : ");
						employementDate = scan.nextLine();
					} while (isValidDate(employementDate) != true);
					
					do
					{
						System.out.print("Input Insurance Amount [1000 / 2000 / 3000] : $");
						insurance = scan.nextInt();
						scan.nextLine();
					} while (insurance != 1000 && insurance != 2000 && insurance != 3000);
					
					Permanent prm2 = new Permanent();
					prm2.setName(name);
					prm2.setBirth(birth);
					prm2.setId(id);
					prm2.setDivision(division);
					prm2.setLevel(level);
					prm2.setEmployementDate(employementDate);
					prm2.setInsurance(insurance);
					vecPermanent.add(prm2);
					
					System.out.println("Input Successful !");
					System.out.println("Press ENTER ...");
					scan.nextLine();
				}
			}
			else if(choose == 2)
			{
				do 
				{
					System.out.print("Input ID [5-Digit] : ");
					id = scan.nextLine();
				} while (id.length() != 5);
				
				exist = false;
				
				for (int i = 0; i < vecContract.size(); i++) 
				{
					if(vecContract.get(i).getId().equals(id))
					{
						System.out.println("Name : " + vecContract.get(i).getName());
						System.out.println("Birth : " + vecContract.get(i).getBirth());
						System.out.println("ID : " + vecContract.get(i).getId());
						System.out.println("Division : " + vecContract.get(i).getDivision());
						System.out.println("Level : " + vecContract.get(i).getLevel());
						System.out.println("Contract Date : " + vecContract.get(i).getContractDate());
						System.out.println("Contract Length : " + vecContract.get(i).getContractLength() + " Months");
						exist = true; break;
					}
				}
				
				if(exist != true)
				{
					for (int i = 0; i < vecPermanent.size(); i++) 
					{
						if(vecPermanent.get(i).getId().equals(id))
						{
							System.out.println("Name : " + vecPermanent.get(i).getName());
							System.out.println("Birth : " + vecPermanent.get(i).getBirth());
							System.out.println("ID : " + vecPermanent.get(i).getId());
							System.out.println("Division : " + vecPermanent.get(i).getDivision());
							System.out.println("Level : " + vecPermanent.get(i).getLevel());
							System.out.println("Employement Date : " + vecPermanent.get(i).getEmployementDate());
							System.out.println("Insurance Amount : $" + vecPermanent.get(i).getInsurance());
							exist = true; break;
						}
					}
				}
				
				if(exist != true)
				{
					System.out.println("Data Not Found !");
				}
				
				System.out.println("Press ENTER ...");
				scan.nextLine();
			}
			else if(choose == 3)
			{
				num = 1;
				System.out.println("=========");System.out.println("Contract");System.out.println("=========");
				System.out.println("=====================================================================================================");
				System.out.println("|No. |Name                |Birth     |ID     |Division   |Level     |Contract date  |Contract length|");
				System.out.println("=====================================================================================================");
				for (int i = 0; i < vecContract.size(); i++)
				{
					System.out.printf("|%-4d|%-20s|%-10s|%-7s|%-11s|%-10s|%-15s|%-9d" + " Months|",num++, vecContract.get(i).getName(), vecContract.get(i).getBirth(), vecContract.get(i).getId(), vecContract.get(i).getDivision(), vecContract.get(i).getLevel() ,vecContract.get(i).getContractDate(), vecContract.get(i).getContractLength());
					System.out.println();
				}
				System.out.println("=====================================================================================================");
				System.out.println();System.out.println();
				
				num = 1;
				System.out.println("=========");System.out.println("Permanent");System.out.println("=========");
				System.out.println("======================================================================================================");
				System.out.println("|No. |Name                |Birth     |ID     |Division   |Level     |Employee date  |Insurance amount|");
				System.out.println("======================================================================================================");
				for (int i = 0; i < vecPermanent.size(); i++)
				{
					System.out.printf("|%-4d|%-20s|%-10s|%-7s|%-11s|%-10s|%-15s|$%-15d|",num++, vecPermanent.get(i).getName(), vecPermanent.get(i).getBirth(), vecPermanent.get(i).getId(), vecPermanent.get(i).getDivision(), vecPermanent.get(i).getLevel() ,vecPermanent.get(i).getEmployementDate(), vecPermanent.get(i).getInsurance());
					System.out.println();
				}
				System.out.println("======================================================================================================");
				System.out.println();System.out.println();
				
				do 
				{
					System.out.print("Input ID [5-Digit] : ");
					id = scan.nextLine();
				} while (id.length() != 5);
				
				exist = false;
				
				for (int i = 0; i < vecContract.size(); i++) 
				{
					if(vecContract.get(i).getId().equals(id))
					{
						System.out.println("Name : " + vecContract.get(i).getName());
						System.out.println("Birth : " + vecContract.get(i).getBirth());
						System.out.println("ID : " + vecContract.get(i).getId());
						System.out.println("Division : " + vecContract.get(i).getDivision());
						System.out.println("Level : " + vecContract.get(i).getLevel());
						System.out.println("Contract Date : " + vecContract.get(i).getContractDate());
						System.out.println("Contract Length : " + vecContract.get(i).getContractLength() + " Months");
						exist = true;
						
						do 
						{
							System.out.print("Edit THIS Data ??? [Y/N] : ");
							yn = scan.nextLine();
						} while (!yn.equals("Y") && !yn.equals("N"));
						
						if(yn.equals("Y"))
						{
							do 
							{
								System.out.print("Input Division [IT / Marketing / Management] : ");
								division = scan.nextLine();
							} while (!division.equals("IT") && !division.equals("Marketing") && !division.equals("Management"));
							
							do 
							{
								System.out.print("Input Level [Staff / Manager / Director] : ");
								level = scan.nextLine();
							} while (!level.equals("Staff") && !level.equals("Manager") && !level.equals("Director"));
							
							name = vecContract.get(i).getName();
							birth = vecContract.get(i).getBirth();
							id = vecContract.get(i).getId();
							contractDate = vecContract.get(i).getContractDate();
							contractLength = vecContract.get(i).getContractLength();
							Contract tempcon = new Contract();
							tempcon.setDivision(division);
							tempcon.setLevel(level);
							tempcon.setName(name);
							tempcon.setBirth(birth);
							tempcon.setId(id);
							tempcon.setContractDate(contractDate);
							tempcon.setContractLength(contractLength);
							vecContract.set(i, tempcon);
							
							System.out.println("Data Edited !");
							break;
						}
					}
				}
				
				if(exist != true)
				{
					for (int i = 0; i < vecPermanent.size(); i++) 
					{
						if(vecPermanent.get(i).getId().equals(id))
						{
							System.out.println("Name : " + vecPermanent.get(i).getName());
							System.out.println("Birth : " + vecPermanent.get(i).getBirth());
							System.out.println("ID : " + vecPermanent.get(i).getId());
							System.out.println("Division : " + vecPermanent.get(i).getDivision());
							System.out.println("Level : " + vecPermanent.get(i).getLevel());
							System.out.println("Employement Date : " + vecPermanent.get(i).getEmployementDate());
							System.out.println("Insurance Amount : $" + vecPermanent.get(i).getInsurance());
							exist = true;
							
							do 
							{
								System.out.print("Edit THIS Data ??? [Y/N] : ");
								yn = scan.nextLine();
							} while (!yn.equals("Y") && !yn.equals("N"));
							
							if(yn.equals("Y"))
							{
								do 
								{
									System.out.print("Input Division [IT / Marketing / Management] : ");
									division = scan.nextLine();
								} while (!division.equals("IT") && !division.equals("Marketing") && !division.equals("Management"));
								
								do 
								{
									System.out.print("Input Level [Staff / Manager / Director] : ");
									level = scan.nextLine();
								} while (!level.equals("Staff") && !level.equals("Manager") && !level.equals("Director"));
								
								name = vecPermanent.get(i).getName();
								birth = vecPermanent.get(i).getBirth();
								id = vecPermanent.get(i).getId();
								employementDate = vecPermanent.get(i).getEmployementDate();
								insurance = vecPermanent.get(i).getInsurance();
								Permanent tempper = new Permanent();
								tempper.setDivision(division);
								tempper.setLevel(level);
								tempper.setName(name);
								tempper.setBirth(birth);
								tempper.setId(id);
								tempper.setEmployementDate(employementDate);
								tempper.setInsurance(insurance);
								vecPermanent.set(i, tempper);
								
								System.out.println("Data Edited !");
								break;
							}
						}
					}
				}
				else if(exist != true)
				{
					System.out.println("Data Not Found !");
				}
				
				System.out.println("Press ENTER ...");
				scan.nextLine();
			}
			else if(choose == 4)
			{
				if(vecContract.size() < 1 && vecPermanent.size() < 1)
				{
					System.out.println("No Data Inputted Yet !");
					System.out.println("Press ENTER ...");
					scan.nextLine();
					return;
				}
				
				if(vecContract.size() < 1)
				{
					System.out.println("=========");System.out.println("Contract");System.out.println("=========");
					System.out.println("-No Data-");
				}
				else
				{
					num = 1;
					System.out.println("=========");System.out.println("Contract");System.out.println("=========");
					System.out.println("=====================================================================================================");
					System.out.println("|No. |Name                |Birth     |ID     |Division   |Level     |Contract date  |Contract length|");
					System.out.println("=====================================================================================================");
					for (int i = 0; i < vecContract.size(); i++)
					{
						System.out.printf("|%-4d|%-20s|%-10s|%-7s|%-11s|%-10s|%-15s|%-9d" + " Months|",num++, vecContract.get(i).getName(), vecContract.get(i).getBirth(), vecContract.get(i).getId(), vecContract.get(i).getDivision(), vecContract.get(i).getLevel() ,vecContract.get(i).getContractDate(), vecContract.get(i).getContractLength());
						System.out.println();
					}
					System.out.println("=====================================================================================================");
					System.out.println();System.out.println();
				}
				
				if (vecPermanent.size() < 1) 
				{
					System.out.println("=========");System.out.println("Permanent");System.out.println("=========");
					System.out.println("-No Data-");
				} 
				else 
				{
					num = 1;
					System.out.println("=========");System.out.println("Permanent");System.out.println("=========");
					System.out.println("======================================================================================================");
					System.out.println("|No. |Name                |Birth     |ID     |Division   |Level     |Employee date  |Insurance amount|");
					System.out.println("======================================================================================================");
					for (int i = 0; i < vecPermanent.size(); i++)
					{
						System.out.printf("|%-4d|%-20s|%-10s|%-7s|%-11s|%-10s|%-15s|$%-15d|",num++, vecPermanent.get(i).getName(), vecPermanent.get(i).getBirth(), vecPermanent.get(i).getId(), vecPermanent.get(i).getDivision(), vecPermanent.get(i).getLevel() ,vecPermanent.get(i).getEmployementDate(), vecPermanent.get(i).getInsurance());
						System.out.println();
					}
					System.out.println("======================================================================================================");
					System.out.println();System.out.println();
				}
				
				do 
				{
					System.out.print("Input ID [5-Digit] : ");
					id = scan.nextLine();
				} while (id.length() != 5);
				
				exist = false;
				
				for (int i = 0; i < vecContract.size(); i++) 
				{
					if(vecContract.get(i).getId().equals(id))
					{
						System.out.println("Name : " + vecContract.get(i).getName());
						System.out.println("Birth : " + vecContract.get(i).getBirth());
						System.out.println("ID : " + vecContract.get(i).getId());
						System.out.println("Division : " + vecContract.get(i).getDivision());
						System.out.println("Level : " + vecContract.get(i).getLevel());
						System.out.println("Contract Date : " + vecContract.get(i).getContractDate());
						System.out.println("Contract Length : " + vecContract.get(i).getContractLength() + " Months");
						exist = true;
						
						do 
						{
							System.out.print("Delete THIS Data ??? [Y/N] : ");
							yn = scan.nextLine();
						} while (!yn.equals("Y") && !yn.equals("N"));
						
						if(yn.equals("Y"))
						{
							vecContract.remove(i);
							exist = false;
							System.out.println("Data Deleted !");
							break;
						}
					}
				}
				
				if(exist != true)
				{
					for (int i = 0; i < vecPermanent.size(); i++) 
					{
						if(vecPermanent.get(i).getId().equals(id))
						{
							System.out.println("Name : " + vecPermanent.get(i).getName());
							System.out.println("Birth : " + vecPermanent.get(i).getBirth());
							System.out.println("ID : " + vecPermanent.get(i).getId());
							System.out.println("Division : " + vecPermanent.get(i).getDivision());
							System.out.println("Level : " + vecPermanent.get(i).getLevel());
							System.out.println("Employement Date : " + vecPermanent.get(i).getEmployementDate());
							System.out.println("Insurance Amount : $" + vecPermanent.get(i).getInsurance());
							exist = true;
							
							do 
							{
								System.out.print("Delete THIS Data ??? [Y/N] : ");
								yn = scan.nextLine();
							} while (!yn.equals("Y") && !yn.equals("N"));
							
							if(yn.equals("Y"))
							{
								vecPermanent.remove(i);
								exist = false;
								System.out.println("Data Deleted !");
								break;
							}
						}
					}
				}
				else
				{
					System.out.println("Data Not Found !");
				}
				
				System.out.println("Press ENTER ...");
				scan.nextLine();
			}
		}while(choose != 5);
	}

	public static void main(String[] args) 
	{
		new Main();
	}

}
