package comp2850.banking

const val MAX_OVERDRAFT = 100

class StudentAccount(holder: String) : BankAccount(holder) {
    var overdraft: Int = 0
        set(value) {
            require(value in 0..100) {"Overdraft must be between 0 and 100"}
            field = value       
        }

    override fun withdraw(amount: Int){
        if (amount <= 0) {
        throw IllegalArgumentException("Withdrawal amount must be greater than 0")
    }
        if (balance - amount >= -overdraft) {
            balance -= amount
        }
        else {
            throw IllegalArgumentException("Insufficient funds for withdrawal")
        }
    }

    fun withdrawalsAllowed(): Boolean {
        if (balance > -overdraft){
            return true
        }
        return false
    }

    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }
}