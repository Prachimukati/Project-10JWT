import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ActivatedRoute } from '@angular/router';
import { ServiceLocatorService } from '../service-locator.service';


@Component({
  selector: 'app-inventory',
  templateUrl: './inventory.component.html',
  styleUrls: ['./inventory.component.css']
})
export class InventoryComponent extends BaseCtl {
  errorMessageTitle: string = '';
  errorMessagefullName: string = '';

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.INVENTORY, locator, route);
  }

  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.supplierName);
    flag = flag && validator.isNotNullObject(form.lastUpdateDate);
    flag = flag && validator.isNotNullObject(form.quantity);
    flag = flag && validator.isNotNullObject(form.product);

    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.supplierName = data.supplierName;
    form.lastUpdateDate = data.lastUpdateDate;
    form.quantity = data.quantity;
    form.product = data.product;
  }

  validateName(event: KeyboardEvent): void {
    const inputValue = (event.target as HTMLInputElement).value;
    const inputChar = event.key;
    const alphabetPattern = /^[a-zA-Z]*$/;  // Pattern to match only alphabetic characters

    if (!alphabetPattern.test(inputChar) && !['Backspace', 'Delete', 'Tab'].includes(inputChar)) {
      event.preventDefault();
      this.errorMessagefullName = 'Only alphabets are allowed.';
      return;
    }

  //  else if (inputValue.length < 3) {
  //     this.errorMessagefullName = 'fullName must be at least 3 characters long.';
  //   } else if (inputValue.length > 15) {
  //     this.errorMessagefullName = 'fullName must not exceed 15 characters.';
  //   } else {
  //     this.errorMessagefullName = '';  // Clear error message if valid
  //   }
  }

  validateAlphabetInput(event) {
    const charCode = event.which || event.keyCode;
    const charStr = String.fromCharCode(charCode);

    // Regular expression to test if the character is a letter
    if (!/^[a-zA-Z]+$/.test(charStr)) {
      event.preventDefault();
    }
  }

}
