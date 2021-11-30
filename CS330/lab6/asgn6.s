/* Author: Vaishak Menon Date: 11/04/2021 */

# Storage for input
.section .data
    inputA: .space 8 # space for 8 bytes
    inputB: .space 8

.section .rodata
    inputAString: .string "Input first number:\n"
    testAString: .string "A is: %d\n"
    inputBString: .string "Input second number:\n"
    testBString: .string "B is: %d\n"
    scanfString: .string "%d"
    firstRequirement: .string "A * 5 = %d\n"
    secondRequirement: .string "(A + B) - (A / B) = %d\n"
    thirdRequirement: .string "(A - B) + (A * B) = %d\n"
    

.text
.global main

main:

# Prints string asking to input first number
movq $inputAString, %rdi
xor %rax, %rax
call printf

# Calls scanf by first moving scanfString from previous lab to rdi
# Also allocates space of inputA
movq $scanfString, %rdi
movq $inputA, %rsi
xor %rax, %rax
call scanf

# Gets previous input and prints out that A is ..., ... being whatever the user inputted
movq $testAString, %rdi
movq inputA, %rsi
movq inputA, %r12
xor %rax, %rax
call printf

# Prints string asking to input second number
movq $inputBString, %rdi
xor %rax, %rax
call printf

# Calls scanf by first moving scanfString from previous lab to rdi
# Also allocates space of inputB
movq $scanfString, %rdi
movq $inputB, %rsi
xor %rax, %rax
call scanf

# Gets previous input and prints out that B is ..., ... being whatever the user inputted
movq $testBString, %rdi
movq inputB, %rsi
movq inputB, %r13
xor %rax, %rax
call printf

# A * 5

# Moves out statement "A * 5 =" to rdi for printf call
movq $firstRequirement, %rdi
# Multiplies A * 4 and then adds A to get A * 5 or 5A and moves it to rsi
movq %r12, %r8
leaq (%r8, %r8, 4), %rsi
# Makes sure rax is empty/0
xor %rax, %rax
# Calls print, prints out the string and the result
call printf

# (A + B) - (A / B)

# Moves out statement "(A + B) - (A / B) =" to rdi for printf call
movq $secondRequirement, %rdi
# Stores user input in other registers so original data does not get destroyed during calculations
movq %r12, %r8
movq %r13, %r9
# Add A to B and move answer to r9
addq %r8, %r9
# Moves value in r9 to rbx for temporary storage
movq %r9, %rbx

# Division math
# Moves original B value back into r9 because data was altered in previous add section
movq %r13, %r9
# Making rdx 0 is a requirement for idivq
movq $0, %rdx
# Moves value in r8 to rax in order to prepare for division
movq %r8, %rax
# Divides rax by r9
idivq %r9

# Subtraction math
# Subtracts rdx from rbx, goes back into rbx
sub %rax, %rbx

# Move rbx, which is the total result, into rsi for print statement
movq %rbx, %rsi
# Makes sure rax is empty/0
xor %rax, %rax
# Calls print, prints out string and result
call printf


# (A - B) + (A * B)
# Moves out statement "(A - B) + (A * B) =" to rdi for printf call
movq $thirdRequirement, %rdi

# (A - B)
# Stores user input in other registers so original data does not get destroyed during calculations
movq %r12, %r8
movq %r13, %r9

# Subtract B from A and place the number back into A.
sub %r9, %r8
movq %r8, %r10

# (A * B)
imul %r12, %r13
movq %r13, %r11

# Adding result of (A - B) with (A * B) and calls print statement
addq %r11, %r10
movq %r10, %rsi
xor %rax, %rax
call printf
