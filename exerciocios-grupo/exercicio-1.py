# Crie um programa que receba um número e diga se ele é par ou ímpar

# Receber um número do usuário
parOuImpar = int(input("Digite um número: "))

# Verificar se o número é par ou ímpar usando a operação de módulo
if parOuImpar % 2 == 0:
    print(f"{parOuImpar} é um número par.")
else:
    print(f"{parOuImpar} é um número ímpar.")
