#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
import pandas as pd
import ${required_python_package}

count = options['Count']

${symbol_pound} Using input_table by having a option with the column name
${symbol_pound} and use Pandas column selection to get values of column
${symbol_pound} id_column = options['id_column']
${symbol_pound} ids = input_table[id_column]

data = []
for i in range(count):
    row = {}
    row['Column 0'] = 'String_{0}'.format(i)
    row['Column 1'] = 0.5 * i
    row['Column 2'] = i
    data.append(row)

output_table = pd.DataFrame(data)
