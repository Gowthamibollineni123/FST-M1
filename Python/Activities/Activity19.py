import pandas
from pandas import ExcelWriter
from pandas import ExcelFile

data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}
	
dataframe = pandas.DataFrame(data)
print(dataframe)

dataframe.to_excel("sample.xlsx", index=False)
