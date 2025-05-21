import { Component, OnInit } from '@angular/core';
import { ServiceLocatorService } from '../service-locator.service';
import { BaseCtl } from '../base.component';
import { ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent extends BaseCtl{

constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
       super(locator.endpoints.ORDER, locator, route);
     }
     validate() {
       return this.validateForm(this.form.data);
     }
     validateForm(form) {
       let flag = true;
       let validator = this.serviceLocator.dataValidator;
       flag = flag && validator.isNotNullObject(form.productName);
       flag = flag && validator.isNotNullObject(form.orderDate);
       flag = flag && validator.isNotNullObject(form.quantity);
       flag = flag && validator.isNotNullObject(form.customer);
       return flag;
     }
   
     populateForm(form, data) {
       form.id = data.id;
       form.productName = data.productName;
       form.orderDate = data.orderDate;
       form.quantity = data.quantity;
       form.customer = data.customer;
      
     }
     parseDate(dateString: string): Date {
      if (dateString) {
        return new Date(dateString);
      }
      return null;
    }
    test() {
  
    }
   
   }