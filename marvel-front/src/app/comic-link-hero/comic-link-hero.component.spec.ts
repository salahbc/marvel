import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ComicLinkHeroComponent } from './comic-link-hero.component';

describe('ComicLinkHeroComponent', () => {
  let component: ComicLinkHeroComponent;
  let fixture: ComponentFixture<ComicLinkHeroComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ComicLinkHeroComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ComicLinkHeroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
