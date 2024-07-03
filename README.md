# SOLID Prensipleri:

## Single Responsibility Principle (SRP): 

### Açıklama: 
Her sınıfın sadece bir sorumluluğu olmalıdır. 

### Örnek Kullanım Yerleri: 
1. CreditCardPayment: Sadece kredi kartı ile ödeme işlemlerini yapan sınıf.
2. CashPayment: Sadece nakit para ile ödeme işlemlerini yapan sınıf.
3. EmailNotification: Sadece email ile bildirim gönderme işlemlerini yapan sınıf.

## Open/Closed Principle (OCP):

### Açıklama:
Sınıflar genişlemeye açık, ancak değişikliğe kapalı olmalıdır.

### Örnek Kullanım Yerleri:
1. Payment: Yeni bir ödeme yöntemi eklemek için interface'i implement eden bir sınıf daha eklemek yeterli olacaktır. Bunun için CreditCardPayment ya da CashPayment sınıflarını veya Payment interface'ini değiştirmeye gerek yok.
2. Notification: Yeni bir bildirim gönderme ortamı eklemek için Notification interface'ini implement eden bir sınıf eklemek yeterli. Örneğin, kolaylıkla SMS bildirim sınıfı eklenebilir. 


## Liskov Substitution Principle (LSP): 

### Açıklama:
Alt sınıflar, üst sınıfın yerine kullanılabilir olmalıdır.

### Örnek Kullanım Yerleri:
1. Payment interface'inden türeyen sınıfları, interface'in yerine kullanabiliriz.
2. Notification interface'inden türeyen sınıf, interface'in yerine kullanılabilir. 


## Interface Segregation Principle (ISP): 

### Açıklama:
Tek bir büyük interface yerine, özelleştirilmiş birden fazla arayüz kullanılmalıdır.

### Örnek Kullanım Yerleri:
1. Payment ve Notification olarak iki farklı interface oluşturuldu.


## Dependency Inversion Principle (DIP):

### Açıklama:
Üst seviye modüllerin alt seviye modüllere bağımlı olmaması gerekir. 

### Örnek Kullanım Yerleri:
1. OrderService sınıfı, EmailNotification sınıfına bağımlı değildir. Notification interface'ine bağımlıdır.
2. OrderService sınıfı, CashPayment sınıfına bağımlı değildir. Payment interface'ine bağımlıdır.
