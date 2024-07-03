SOLID Prensipleri:
1. Single Responsibility Principle (SRP): Her sınıfın sadece bir sorumluluğu olmalıdır. (Tüm işlemler olabildiğince küçük sınıflara bölündü. Ödeme, sipariş, bildirim yollama gibi.)
2. Open/Closed Principle (OCP): Sınıflar genişlemeye açık, ancak değişikliğe kapalı olmalıdır. (Sınıfların temel özelliklerini belirlediğim için, herhangi bir değişikliğe ihtiyaç olmadan ekleme yapılabilir.)
3. Liskov Substitution Principle (LSP): Alt sınıflar, üst sınıfın yerine kullanılabilir olmalıdır. (Payment'tan türeyen CreditCardPayment ve CashPayment sınıfları, Payment interface'inin yerine kullanılabilir.) 
4. Interface Segregation Principle (ISP): Tek bir büyük interface yerine, özelleştirilmiş birden fazla arayüz kullanılmalıdır. (Notification ve payment olarak iki interface oluşturuldu.)
5. Dependency Inversion Principle (DIP): Üst seviye modüllerin alt seviye modüllere bağımlı olmaması gerekir. (OrderService sınıfı, EmailNotification'a bağımlı değildir, Notification interface'ine bağlıdır.)
