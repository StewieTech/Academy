const TAX_RATE = 0.1 ;

class Invoice {
    constructor() {
        this.items = [] ;
    }

    addItem(name, price, quantity) {
        this.items.push({ name, price, quantity});
    }

    

    getSubtotal() {
        return this.items.reduce((acc, item) => acc + (item.price * item.quantity), 0) ;
    }

    getTax() {
        return this.getSubtotal() * TAX_RATE;
    }

    getTotal() {
        return this.getSubtotal() + this.getTax() ;
    }

    print() {
        console.log("Items:");
        this.items.forEach(item => console.log(`${item.name}: $${item.price.toFixed(2)} x ${item.quantity}`));
        console.log(`Subtotal: $${this.getSubtotal().toFixed(2)}`);
        console.log(`Tax: $${this.getTax().toFixed(2)}`);
        console.log(`Total: $${this.getTotal().toFixed(2)}`);
    }

}
const invoice  = new Invoice() ;
invoice.addItem("Item 1", 10.00, 2);
invoice.addItem("Item 2", 5.50, 3);

invoice.print();
